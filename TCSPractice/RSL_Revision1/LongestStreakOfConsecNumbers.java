import java.util.HashSet;

public class LongestStreakOfConsecNumbers {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {100, 4, 200, 1, 3, 2})); // Output: 4
        System.out.println(longestConsecutive(new int[] {1, 0, 1, 2})); // Output: 3
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}