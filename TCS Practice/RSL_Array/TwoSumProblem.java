import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];

            int numberNeeded = target - currentNumber;

            if (numberIndexMap.containsKey(numberNeeded)) {

                return new int[] { numberIndexMap.get(numberNeeded), i };

            }
            numberIndexMap.put(currentNumber, i);

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int arr[] = new int[] { 7, 2, 13, 11 };
        int target = 9;

        int[] result = twoSum(arr, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}