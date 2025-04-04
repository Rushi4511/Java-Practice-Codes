import java.util.HashMap;
import java.util.Map;

public class PrtStriWithoutRepChar {

    public static void nonRepChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                System.out.print(ch);
                result.append(ch);
            }
        }
        System.out.println();
        System.out.println(result);

    }

    public static void main(String[] args) {
        String str = "Helper";

        nonRepChar(str);
    }

}
