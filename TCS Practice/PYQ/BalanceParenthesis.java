package PYQ;

public class BalanceParenthesis {

    public static String balanceParenthesis(String input) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '{') {
                result.append(ch);  // Add opening brace to result
                openCount++;  // Increment openCount for each '{'
            } else if (ch == '}' && openCount > 0) {
                result.append(ch);  // Add closing brace to result if there's a matching '{'
                openCount--;  // Decrease openCount for each '}'
            } else if (ch == '}' && openCount == 0) {
                result.insert(0, '{');  // If there's no matching '{', add one at the start
                result.append(ch);  // Add the current closing brace
            }
        }

        // After processing the string, add any unmatched opening braces with closing braces
        while (openCount > 0) {
            result.append('}');
            openCount--;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "{}}{}";  // Test input string
        System.out.println(balanceParenthesis(str));  // Output the balanced string
    }
}
