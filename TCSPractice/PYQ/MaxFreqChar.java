public class MaxFreqChar {

    public static void main(String[] args) {
        String str = "Rushikesh";

        char ans = 'a';

        int maxFreq = 0;
        int N = str.length();

        int count[] = new int[256];

        for (int i = 0; i < N; i++) {
            count[str.charAt(i)]++;

            if (count[str.charAt(i)] > maxFreq) {
                maxFreq = count[str.charAt(i)];

                ans = str.charAt(i);
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 1) {
                char ch = (char) i;

                System.out.println(ch + ":" + count[i]);
            }
        }
    }

}
