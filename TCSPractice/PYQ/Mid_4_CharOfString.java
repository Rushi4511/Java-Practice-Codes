package TCSPractice.PYQ;

public class Mid_4_CharOfString {

    public static void main(String[] args) {
        String str = "Rushikesh";

        int len = str.length();

        if (len < 4) {
            System.out.println("Null");
        }

        int start = (len - 4) / 2;

        System.out.println(str.substring(start, start + 4));
    }

}
