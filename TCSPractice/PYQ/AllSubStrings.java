package TCSPractice.PYQ;

public class AllSubStrings {

    public static void main(String[] args) {

        String str = "Rushikesh";

        for (int i = 0; i < str.length(); i++) {

            String result = "";

            for (int j = i; j < str.length(); j++) {

                result = result + str.charAt(j);
            }
            System.out.println(result);
        }

    }

}
