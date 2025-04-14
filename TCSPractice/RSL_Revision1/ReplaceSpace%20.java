class ReplaceSpace {

    public static String replace(String str) {
        StringBuilder result = new StringBuilder();

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append("%20");

                res = res + "%20";
            } else {
                result.append(str.charAt(i));

                res = res + str.charAt(i);
            }
        }
        System.out.println(res);

        return res;
    }

    public static void main(String[] args) {
        String str = "Mr John Smith";

        System.out.println(replace(str));
    }

}
