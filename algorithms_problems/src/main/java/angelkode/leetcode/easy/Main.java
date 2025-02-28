package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MaxDepthBinaryTree bt = new MaxDepthBinaryTree();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        System.out.println(bt.maxDepth(root));

    }
}
