package TCSPractice.PYQ;

public class ReplaceSpaceWith {

    public static String replaceWithBuiltIn(String str) {

        String rep = "%20";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {

                result.append(rep);

            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static char[] withoutBF(char[] str) {

        int spaceCount = 0;
        int length = 0;

        int MAX = 2000;

        for (length = 0; length < str.length; length++) {

            if (str[length] == ' ') {

                spaceCount++;
            }

        }

        int newLength = length + spaceCount * 2;

        if (newLength > MAX) {
            return null;

        }

        char[] result = new char[newLength];

        int index = newLength - 1;

        for (int i = length - 1; i >= 0; i--) {

            if (str[i] == ' ') {
                result[index] = '0';
                result[index - 1] = '2';
                result[index - 2] = '%';

                index -= 3;
            } else {
                result[index] = str[i];
                index--;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        String str = "My Name is Rushikesh";

        System.out.println(replaceWithBuiltIn(str));

        char[] string = str.toCharArray();

        String result = new String(withoutBF(string));

        System.out.println(result);

    }

}
