package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MinimumDepthBinaryTree bt = new MinimumDepthBinaryTree();

        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        System.out.println(bt.minDepth(root));

    }
}
