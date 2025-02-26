package angelkode.leetcode.easy;

import java.util.Arrays;

public class PlusOne {
    public int[] solve(int[] digits){
        if((digits[digits.length -1] + 1) <= 9){
            digits[digits.length - 1]++;

            return digits;
        }

        int[] result;
        if(Arrays.stream(digits).allMatch(digit -> digit == 9)){
            result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        result = new int[digits.length];
        result[result.length - 1] = 0;

        int accumulator = 1;
        for(int index = result.length - 2; index >= 0; index--){

            if(digits[index] + accumulator < 10){
                result[index] = digits[index] + accumulator;
                accumulator = 0;
                continue;
            }

            result[index] = 0;
        }
        return result;
    }
}
