package TCSPractice.PYQ;

public class StockBuySell {

    public static int maxProf(int[] arr) {
        int minNum = Integer.MAX_VALUE;
        int maxProf = 0;

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
            if (maxProf < (arr[i] - minNum)) {
                maxProf = arr[i] - minNum;
            }
        }

        return maxProf;
    }

    public static int maxProf1(int[] arr) {
        int maxProf = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    maxProf = Math.max(arr[j] - arr[i], maxProf);
                }
            }
        }

        return maxProf;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 4, 1, 5, 6, 7, 8 };
        System.out.println(maxProf(arr));
        System.out.println(maxProf1(arr));
    }

}
