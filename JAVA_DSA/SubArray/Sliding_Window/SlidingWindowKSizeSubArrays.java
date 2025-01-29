package Sliding_Window;

public class SlidingWindowKSizeSubArrays {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int K = 4;
        int start = 0;
        int end = K - 1;

        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (end < arr.length) {

            if (start == 0) {
                sum = 4;
            } else
                sum = sum - arr[start - 1] + arr[end];
            start++;
            end++;
            // System.out.println(sum);

            if (max < sum)
                max = sum;

            System.out.println(max);
        }

    }

}
