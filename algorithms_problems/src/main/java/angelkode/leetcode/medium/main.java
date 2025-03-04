package angelkode.leetcode.medium;

import angelkode.leetcode.extraClasses.TreeNode;

public class main {
    public static void main(String[] args) {
        Search2dMatrix search = new Search2dMatrix();

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        System.out.println(search.searchMatrix(matrix,target));
    }
}
