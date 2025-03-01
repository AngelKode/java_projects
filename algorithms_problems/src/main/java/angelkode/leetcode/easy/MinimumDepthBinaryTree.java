package angelkode.leetcode.easy;

import angelkode.leetcode.extraClasses.TreeNode;

public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        //Base case
        if(root == null) return 0;

        //At least any tree have minimum depth of 1 if not null
        int minimumDepthValue = 1;

        //If we get to a leaf, break recursive cicle
        if(root.left == null && root.right == null) {
            return minimumDepthValue;
        }

        //Calculate minimum depths of each subtree
        int minDepthLeft = minDepth(root.left);
        int minDepthRight = minDepth(root.right);

        //If any subtree has a value 0, return the sum of: opposite subtree min depth value + 1
        if(minDepthLeft == 0) return minDepthRight + minimumDepthValue;
        if(minDepthRight == 0) return minDepthLeft + minimumDepthValue;

        //If both subtrees have at least depth of 1, get the minimum value between each subtree and add 1
        return minimumDepthValue + Math.min(minDepthLeft, minDepthRight);
    }
}
