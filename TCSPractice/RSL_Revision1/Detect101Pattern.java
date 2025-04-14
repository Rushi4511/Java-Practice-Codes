class Detect101Pattern {

    public static boolean checkPattern(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.charAt(i) == '1' && str.charAt(i + 1) == '0' && str.charAt(i + 2) == '1') {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        String str = "10000000001001";

        if (checkPattern(str)) {
            System.out.println("Pattern Detected");
        } else {
            System.out.println("Pattern Not Detected");
        }

    }

}
