class SubArray4 {
    public static void main(String[] args) {

        int arr[] = new int[] { 2, 4, 1, 3 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    if (k != j) {
                        System.out.print(arr[k] + ",");

                    } else
                        System.out.print(arr[k]);
                }
                System.out.println();
            }
        }

    }
}