package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BalancedBinaryTree bt = new BalancedBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        System.out.println(bt.isBalanced(root));

    }
}
