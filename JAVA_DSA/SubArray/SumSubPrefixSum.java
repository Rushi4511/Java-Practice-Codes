public class SumSubPrefixSum {

    public static void main(String[] args) {
        int maxSum = Integer.MIN_VALUE;
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int j = 1; j < arr.length; j++) {
            prefixSum[j] = prefixSum[j - 1] + arr[j];
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                if (i == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[i - 1];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }

            }
        }
        System.out.println(maxSum);
    }
}
