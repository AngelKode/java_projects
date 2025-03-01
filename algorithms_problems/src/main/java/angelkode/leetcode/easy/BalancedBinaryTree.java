package angelkode.leetcode.easy;

import angelkode.leetcode.extraClasses.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        //Base cases to terminate recursion
        if (root == null) return true;
        if(root.left == null && root.right == null) return true;

        //Calculate left and right height and compare
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        //Validate the height difference between each subtree, if higher than 1 the tree is not balanced
        boolean isCurrentNodeBalanced = rightHeight == leftHeight || Math.abs(rightHeight) - 1 == leftHeight || Math.abs(leftHeight) - 1 == rightHeight ;

        //If not balanced, terminate
        if(!isCurrentNodeBalanced) {return false;}

        //Otherwise, continue validating both subtrees of the current root
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int calculateHeight(TreeNode node) {
        //Base case
        if (node == null) return 0;

        //If the current node is not null, at least has height of 1
        int baseHeight = 1;

        //Calculate both sizes
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        //Return the max height of both subtrees and the actual root
        return Math.max(leftHeight, rightHeight) + baseHeight;
    }
}
