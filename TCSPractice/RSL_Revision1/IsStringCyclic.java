public class IsStringCyclic {

    public static boolean areCyclic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            

            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            System.out.println(str1);

            if (str1.equals(str2)) {
                

                return true;
            }

            char ch = str1.charAt(str1.length() - 1);
            str1 = ch + str1.substring(0, str1.length() - 1);
        }

        return false;

    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        System.out.println(areCyclic(str1, str2));

    }

}
