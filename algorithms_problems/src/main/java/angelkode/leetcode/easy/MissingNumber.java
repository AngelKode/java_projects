package angelkode.leetcode.easy;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int maxNumber = nums.length;
        int sumGoal = maxNumber * (maxNumber + 1) / 2;
        int sumCurrent = Arrays.stream(nums).sum();
        if(sumGoal != sumCurrent){
            return sumGoal - sumCurrent;
        }
        return 0;
    }
}
