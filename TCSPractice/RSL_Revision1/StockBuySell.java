class StockBuySell {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 7 };
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (diff < arr[i] - min) {
                diff = arr[i] - min;
                System.out.println(min);
                System.out.println(diff);
            }

        }

        System.out.println(diff);
    }

}
