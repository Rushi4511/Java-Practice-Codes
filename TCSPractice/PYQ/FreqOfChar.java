public class FreqOfChar {
    public static void main(String[] args) {
        String str = "Rushikesh";
        int[] freq = new int[200];

        int maxFreq = 1;
        char maxFreqChar = ' ';

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxFreqChar = ch;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] >= 1) {
                System.out.print(str.charAt(i) + ":" + freq[str.charAt(i)] + ",");
            }
        }
        System.out.println();

        System.out.println(maxFreqChar + ":" + maxFreq);
    }
}
