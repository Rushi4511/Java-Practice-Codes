public class SumOfOddInFibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;
        int num = 10;
        int sumOdd = 0;

        if (a % 2 != 0) {
            sumOdd += a;
        }
        System.out.print(a + " "); // Print first Fibonacci number

        // Special case: handle the second Fibonacci number, 1
        if (b % 2 != 0) {
            sumOdd += b;
        }
        System.out.print(b + " ");

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;

            if (c >= num) {
                break;
            }

            if (c % 2 != 0) {
                sumOdd += c;
            }

            System.out.print(c + " ");

        }
        System.out.println();

        System.out.println(sumOdd);

    }

}
