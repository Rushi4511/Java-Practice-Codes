class DecodeString {

    public static String decodeString(String str, int k) {

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        StringBuilder num = new StringBuilder();

        int rep = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if (num.length() > 0) {
                    rep = Integer.parseInt(num.toString());
                    while (rep != 0) {
                        result.append(word);
                        rep--;
                    }
                    word.setLength(0); // Clear word
                    num.setLength(0); // Clear number
                }

                word.append(ch);
            } else if (Character.isDigit(ch)) {

                num.append(ch);

            }
        }

        if (num.length() > 0) {
            rep = Integer.parseInt(num.toString());
            while (rep != 0) {
                result.append(word);
                rep--;
            }
            word.setLength(0); // Clear word
            num.setLength(0); // Clear number
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String str = "RS3L1";
        int k = 7;

        String strAfter = decodeString(str, k);
        System.out.println(strAfter);

        System.out.println(strAfter.charAt(k - 1));
    }
}

