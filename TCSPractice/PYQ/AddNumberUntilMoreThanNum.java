import java.util.Scanner;

public class AddNumberUntilMoreThanNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (sum + num < 9) {
            sum += num;
        }

        System.out.println(sum);
    }

}
