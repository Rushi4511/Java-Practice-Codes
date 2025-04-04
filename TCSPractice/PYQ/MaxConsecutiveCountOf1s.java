public class MaxConsecutiveCountOf1s {

    public static int consecCount1(int[] arr) {

        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1 };

        System.out.println(consecCount1(arr));
    }

}
