import java.util.*;

class ProductOfString {

    public static int convert(String s1) {
        int num = 0;
        for (int i = 0; i < s1.length(); i++) {
            num = num * 10 + ((int) s1.charAt(i) - 48);
        }

        return num;
    }

    public static String productOfString(String s1, String s2) {
        int num1 = convert(s1);
        int num2 = convert(s1);

        int product = num1 * num2;
        String result = product + "";

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s3 = productOfString(s1, s2);

        System.out.println(s3);
    }
}