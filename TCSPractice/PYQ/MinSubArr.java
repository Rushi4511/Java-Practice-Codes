package TCSPractice.PYQ;

public class MinSubArr {

    public static int minSubArr(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                    if (minSum > sum) {
                        minSum = sum;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.println("Minimum SubArray :");
        System.out.print("[");

        for (int i = start; i <= end; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        return minSum;

    }

    public static int minSubArr_Using_CarryForward(int[] arr) {

        int minSum = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[i];

                if (minSum > sum) {
                    minSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        System.out.print("[");

        for (int i = start; i <= end; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        return minSum;
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3, 4, 6, 1 };
        System.out.println(minSubArr(arr));

        System.out.println(minSubArr_Using_CarryForward(arr));
    }

}