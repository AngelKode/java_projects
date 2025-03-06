package angelkode.leetcode.medium;

import java.util.Arrays;

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
        int middleRow = (rows / 2) - 1;
        int middleCol = cols / 2;
        int middleValue = matrix[middleRow][middleCol];
        int minIndexRow = 0, maxIndexRow = matrix.length,minIndexCol = 0, maxIndexCol = matrix[0].length;

        //If target not at the middle, evaluate if the value founded is greater that the target
        //If so, the value is on the left side, otherwise, on the right side

        while(minIndexRow <= maxIndexRow) {

            if (middleValue == target) {
                return true;
            }

            if(middleValue < target){
                //Target at right side
                //TODO
                //UPDATE INDEXES TO GET SUBARRAY
                if(simpleLinearBinarySearch(minIndexCol,maxIndexCol,matrix[minIndexRow],target)){
                    return true;
                }
                minIndexRow++;
            }else{
                //TODO
                //UPDATE INDEXES TO GET SUBARRAY
                if(simpleLinearBinarySearch(minIndexCol,maxIndexCol,matrix[minIndexRow],target)){
                    return true;
                }
                maxIndexRow--;
            }
            middleValue = (maxIndexRow + minIndexRow) / 2;
        }

        //False if nothing founded, worst case
        return false;
    }

    private boolean simpleLinearBinarySearch(int minIndex,int maxIndex, int[] subArray, int target) {
        if (subArray.length == 1) {
            return target == subArray[0];
        }

        if(subArray[0] == target || subArray[subArray.length - 1] == target){
            return true;
        }

        int min = 0, max = subArray.length - 1;
        int midValue = max / 2;

        while (min <= max) {
            if(subArray[midValue] == target){
                return true;
            }

            if(subArray[midValue] < target){
                //Target at right side
                min = midValue + 1;//Update min index
            }else{
                //Target at left side
                max = midValue - 1;
            }
            midValue = (max + min) / 2;
        }

        return false;
    }
}
