package Sliding_Window;

public class PrintKSizeSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        int K = 4;
        int start = 0;
        int end = K - 1;
        int count = 0;

        while (end < arr.length) {

            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + ",");

            }
            count++;
            start++;
            end++;
            System.out.println();

        }

    }

}
