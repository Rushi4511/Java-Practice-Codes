package Sliding_Window;

public class MaxKSizeSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int K = 4;
        int start = 0;
        int end = K - 1;
        int count = 0;

        int maxSum = 0;
        int s = 0;
        int e = 0;

        while (end < arr.length) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + ",");
                sum = sum + arr[i];

            }
            if (sum > maxSum) {
                maxSum = sum;
                s = start;
                e = end;
            }
            count++;
            start++;
            end++;
            System.out.println();

        }

        for (int j = s; j <= e; j++) {
            System.out.print(arr[j] + ",");
        }

    }

}
