package Arrays.PYQ;

public class CheckCyclicStrings {

    public static boolean isRotation(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i < n; i++) {

            if (s1.equals(s2)) {
                return true;
            }
            char ch = s1.charAt(s1.length() - 1);

            s1 = ch + s1.substring(0, s1.length() - 1);
            System.out.println(s1);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(isRotation(s1, s2));
    }
}