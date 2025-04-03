package Arrays.PYQ;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] twoSum(int nums[], int target) {

        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int currIndex = 0; currIndex < nums.length; currIndex++) {
            int currentNumber = nums[currIndex];

            int NumberNeeded = target - currentNumber;

            if (numberMap.containsKey(NumberNeeded)) {
                int[] result = new int[] { numberMap.get(NumberNeeded), currIndex };
                return result;
            }

            numberMap.put(currentNumber, currIndex);
        }

        return null;
    }

    public static void main(String[] args) {

        int[] nums = new int[] { 7, 2, 13, 11 };

        int target = 9;

        System.out.println(twoSum(nums, target));

        int[] result = twoSum(nums, target);

        for (int i = 0; i < result.length; i++) {
            if (i == 0) {

                System.out.print("[" + result[i] + ",");

            } else if (i == result.length - 1) {
                System.out.print(result[i] + "]");
            } else {
                System.out.print(result[i] + " ");
            }
        }
    }

}
