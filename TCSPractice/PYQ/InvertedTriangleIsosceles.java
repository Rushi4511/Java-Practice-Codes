public class InvertedTriangleIsosceles {

    // Both Inverted and Vertical triangles
    // Mix both to give diamond Pattern

    public static void main(String[] args) {
        int height = 5;

        for (int i = height; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (height - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
