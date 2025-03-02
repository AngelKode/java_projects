package angelkode.leetcode.medium;

public class RotateImage {
    public void rotate(int[][] matrix) {
        //Base case
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;

        //Get max index based on matrix length
        int maxIndex = matrix[0].length - 1;

        int temporalVariable = 0;//To help us with rotate process
        int operationLimit = 0; //To control the number of operations when rotating the matrix

        //This cycle controls at where cycle we are (subsection)
        //For example, in a 4x4 matrix, we can have 2 sections, 1 of 4x4 and the other 2x2
        for(int sectionCount = 0; sectionCount < matrix.length / 2; sectionCount++) {
            //We change the operationLimit for the next section
            operationLimit = matrix.length - ((sectionCount * 2) + 1);

            //The greater the sectionCount, the lower of assignments needed for rotating that section
            //When rotating the 4x4 section, we need 3 operations for each size (4)
            //When rotating  the 2x2 section, we need 1 operation for each size (1)
            //That means we need n operations - (sectionCount), n operations starting at n - 1
            for(int operationCount = 0; operationCount < operationLimit; operationCount++) {
                temporalVariable = matrix[sectionCount][operationCount + sectionCount];//Top array matrix temporal value
                matrix[sectionCount][operationCount  + sectionCount] = matrix[maxIndex - operationCount - sectionCount][sectionCount]; //Updating Top array matrix
                matrix[maxIndex - operationCount - sectionCount][sectionCount] = matrix[maxIndex - sectionCount][maxIndex - operationCount - sectionCount]; //Updating Left array matrix
                matrix[maxIndex - sectionCount][maxIndex - operationCount - sectionCount] = matrix[sectionCount + operationCount][maxIndex - sectionCount]; // Updating Bottom array matrix
                matrix[sectionCount + operationCount][maxIndex - sectionCount] = temporalVariable; // Updating Right array matrix
            }
        }
    }
}
