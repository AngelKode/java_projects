package angelkode.leetcode.medium;

import angelkode.leetcode.extraClasses.TreeNode;

public class AddOneRow {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        //If depth == 1, create new root with val parameter and to its left, the previous root
        if(depth == 1){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        //TODO
        return null;
    }
}
