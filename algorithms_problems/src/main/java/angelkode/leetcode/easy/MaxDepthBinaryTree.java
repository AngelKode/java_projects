package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        //Base case
        if (root == null) return 0;

        //If root is not null, at least the tree has a depth of 1
        int baseDepth = 1;

        //Calculate depth of left and right subtrees
        int leftSize = maxDepth(root.left);
        int rightSize = maxDepth(root.right);

        //Return the base depth + the longest dept, right or left
        return baseDepth + Math.max(leftSize, rightSize);
    }
}
