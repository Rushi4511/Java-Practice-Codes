package Arrays.PYQ;

class LowerTriangleSum {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] mat = new int[][] { { 6, 5, 4 }, { 1, 2, 5 }, { 7, 9, 7 } };

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (j <= i) {
                    sum += mat[i][j];
                }

            }
        }

        System.out.println(sum);

    }
}