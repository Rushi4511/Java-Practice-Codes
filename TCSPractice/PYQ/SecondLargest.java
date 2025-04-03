package TCSPractice.PYQ;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secMax = max;
                max = arr[i];
            }
        }
        System.out.println(secMax);
    }

}
