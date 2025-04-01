import java.util.*;

public class PrintStringWithoutRepeatingChar {

    static String countCharacterOccurrences(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to a character array and iterate through it
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get each character from the string

            // If the character is already in the map, increment its count
            // Otherwise, add it to the map with a count of 1
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the counts of each character
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charCountMap.get(ch) == 1) {
                result = result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example input string
        String input = "helper";

        // Call the function to count occurrences
        System.out.println(countCharacterOccurrences(input));
    }
}
