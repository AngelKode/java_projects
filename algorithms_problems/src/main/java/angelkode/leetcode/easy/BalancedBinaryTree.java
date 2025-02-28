package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if(root.left == null && root.right == null) return true;

        //Calculate left and right height and compare
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        //If the right height is higher than the left for 1 or more
        return rightHeight == leftHeight || Math.abs(rightHeight) - 1 == leftHeight || Math.abs(leftHeight) - 1 == rightHeight ;
    }

    private int calculateHeight(TreeNode node) {
        //Base case
        if (node == null) return 0;

        //Calculate both sizes
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        //TODO

        //Return the height of both subtrees and the actual root
        return leftHeight + rightHeight + 1;
    }
}
