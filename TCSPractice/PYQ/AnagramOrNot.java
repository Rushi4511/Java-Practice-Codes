public class AnagramOrNot {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        } else if (str1.equals(str2)) {
            return true;
        }

        int[] freq = new int[200];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "ACT";
        String str2 = "CTA";

        System.out.println(isAnagram(str1, str2));
    }

}
