public class Fibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int num = 10;

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");

        }

    }

}
