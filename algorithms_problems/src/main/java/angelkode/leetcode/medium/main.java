package angelkode.leetcode.medium;

import angelkode.leetcode.extraClasses.TreeNode;

public class main {
    public static void main(String[] args) {
        Search2dMatrix search = new Search2dMatrix();

        int[][] matrix = {{1},{3}};
        int target = 0;

        //System.out.println(search.searchMatrix(matrix,target));
        System.out.println(search.searchMatrix(matrix, target));
    }
}
