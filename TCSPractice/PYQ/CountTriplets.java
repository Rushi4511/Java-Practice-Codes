package TCSPractice.PYQ;

public class CountTriplets {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
