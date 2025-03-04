package angelkode.leetcode.medium;

public class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        //Get the first value
        if (matrix[0][0] == target) {
            return true;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        //Get the last value
        if (matrix[rows - 1][cols - 1] == target) {
            return true;
        }

        //Using binary search if not founded
        int middleRow = rows / 2;
        int middleCol = cols / 2;
        int middleValue = matrix[middleRow][middleCol];

        if (middleValue == target) {
            return true;
        }

        //If target not at the middle, evaluate if the value founded is greater that the target
        //If so, the value is on the left side, otherwise, on the right side
        boolean isFounded = false;

        while(!isFounded || middleRow >= 0){
            if(target < matrix[middleRow][middleCol]){
                //If it's smaller, check if we have any items left at the left of the current array
                if(middleCol == 0){
                    //If no items left at the current array, get the mid value of the left size of the current matrix
                    //For example, if we have a matrix 6x6, the middle array is at the index 3, if nothing found
                    //The new mid value will only be between index 0 and 2
                    middleRow = (rows - middleRow - 1) / 2;
                    middleCol = cols / 2;
                    continue;
                }
                //If not 0, then we have at least 1 item left at the current array
                middleCol = cols / 2;
            }

            if(target > matrix[middleRow][middleCol]){
                //If it's bigger, check if we have any items left at the right of the current array
                if(middleCol == cols){
                    //If no items left at the current array, get the mid value of the right size of the current matrix
                    //For example, if we have a matrix 6x6, the middle array is at the index 3, if nothing found
                    //The new mid value will only be between index 4 and 5
                    middleRow = ((rows - middleRow) / 2 ) + middleRow;
                    middleCol = cols / 2;
                    continue;
                }
                //If not 0, then we have at least 1 item left at the current array
                middleCol = (cols / 2) + middleCol;
            }
        }
        //False if nothing founded, worst case
        return false;
    }
}
