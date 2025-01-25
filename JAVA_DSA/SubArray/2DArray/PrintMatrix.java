
class PrintMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

}
