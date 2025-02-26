package angelkode.leetcode.easy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PlusOne plusOne = new PlusOne();

        Arrays.stream(plusOne.solve(new int[]{8,9,9,9})).forEach(System.out::println);

    }
}
