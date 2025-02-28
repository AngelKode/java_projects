package angelkode.leetcode.easy;

import angelkode.leetcode.easy.extraClasses.TreeNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BalancedBinaryTree bt = new BalancedBinaryTree();

        TreeNode root = new TreeNode(31);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);

        System.out.println(bt.isBalanced(root));

    }
}
