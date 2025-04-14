public class StringToInteger {
    public static int convert(String str1) {

        int num = 0;

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
            System.out.println((int) (str1.charAt(i) - 48));
            num = num * 10 + ((int) str1.charAt(i) - 48);
        }

        return num;

    }

    public static void main(String[] args) {
        String num2 = "123";
        System.out.println(convert(num2));
    }

}
