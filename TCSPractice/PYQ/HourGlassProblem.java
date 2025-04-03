package TCSPractice.PYQ;

public class HourGlassProblem {

    public static int findMaxSum(int[][] arr, int rows, int cols) {

        int maxSum = 0;

        int r = 0;
        int c = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {

                int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) + (arr[i + 1][j + 1])
                        + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                if (maxSum < sum) {
                    r = i;
                    c = j;

                    maxSum = sum;
                }
            }

        }
        int i = r;
        int j = c;
        System.out.println((arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]));

        System.out.println("  " + (arr[i + 1][j + 1]) + "   ");

        System.out.println((arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]));

        return maxSum;

    }

    public static void main(String[] args) {

        int arr[][] = new int[][] { { 1, 1, 1, 0, 0 }, { 0, 1, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println(findMaxSum(arr, rows, cols));

    }

}
