package angelkode.leetcode.medium;

import angelkode.leetcode.extraClasses.TreeNode;

public class main {
    public static void main(String[] args) {
        RotateImage rotate = new RotateImage();
        int[][] matrix = {{2,29,20,26,16,28},{12,27,9,25,13,21},{32,33,32,2,28,14},{13,14,32,27,22,26},{33,1,20,7,21,7},{4,24,1,6,32,34}};

        rotate.rotate(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
