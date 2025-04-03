import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int rev = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        System.out.println(sum);
        System.out.println(rev);
    }
}