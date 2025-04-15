import java.util.*;

public class NonRepEle {

    public static void remDuplicate(String str) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.print(entry.getKey());

            }
        }

    }

    public static void main(String[] args) {
        String str = "Helper";
        remDuplicate(str);
    }

}
