package PYQ;

public class Detect101Pattern {

    public static boolean is101Pattern(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '1' && str.charAt(i + 1) == '0' && str.charAt(i + 2) == '1') {
                return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "100101000000100";

        if (is101Pattern(str)) {
            System.out.println("Detected 101 Pattern");
        } else {
            System.out.println("Not Detected 101 Pattern");
        }
    }

}
