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

        //If we only have one element, return false due to we already validate it
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1 && cols == 1) {
            return false;
        }

        //Get the last value
        if (matrix[rows - 1][cols - 1] == target) {
            return true;
        }

        //Using binary search if not founded
        int middleRow = rows / 2;
        int middleCol = cols / 2;
        int middleValue = matrix[middleRow][middleCol];
        int minIndexRow = 0, maxIndexRow = matrix.length - 1,minIndexCol, maxIndexCol;

        //While min index isnt grater than max index
        //if that happens, we already check the last item
        while(minIndexRow <= maxIndexRow) {

            //Before validate left or right side, validate if the current item is the target
            if (middleValue == target) {
                return true;
            }

            if(middleValue < target){
                //Target at right side
                minIndexCol = ((middleCol + 1) == matrix[middleRow].length) ? matrix[middleRow].length : middleCol + 1;
                maxIndexCol = matrix[middleRow].length - 1;
                if(simpleLinearBinarySearch(minIndexCol,maxIndexCol,matrix[minIndexRow],target)){
                    return true;
                }
                //If nothing founded at the sub_array at the right of the current element of the array
                //add min index + 1
                minIndexRow++;
            }else{
                //Target at left side
                minIndexCol = 0;
                maxIndexCol = ((middleCol - 1) < 0 ? middleCol : middleCol - 1);
                if(simpleLinearBinarySearch(minIndexCol,maxIndexCol,matrix[minIndexRow],target)){
                    return true;
                }
                //If nothing founded at the sub_array at the left of the current element of the array
                //subtract max index - 1
                maxIndexRow--;
            }

            //If nothing founded, calculate the new middle value indexes
            middleRow = (maxIndexRow + minIndexRow) / 2;
            //And get the item
            middleValue =  matrix[middleRow][middleCol];
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
