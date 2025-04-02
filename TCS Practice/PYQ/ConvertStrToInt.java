package PYQ;

class ConvertStrToInt {

    public static int convert(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            num = num * 10 + ((int) str.charAt(i) - 48);
        }

        return num;
    }

    public static void main(String[] args) {
        String str = "12345";

        int num = Integer.parseInt(str);

        System.out.println(convert(str));
    }
}