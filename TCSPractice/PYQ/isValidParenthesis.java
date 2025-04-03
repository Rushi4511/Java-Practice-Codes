package Arrays.PYQ;

import java.util.Stack;

class ValidParenthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>(); // Stack to hold the opening parentheses

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println("Processing character: " + ch);

            // Ignore non-parenthesis characters (letters in this case)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == '+' || ch == '-') {
                continue;
            }

            // Push opening parentheses onto the stack
            else if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Handle closing parentheses and check if they match
            else {
                // Check if stack is not empty and top of the stack matches the closing
                // parenthesis
                if (!st.empty() &&
                        ((st.peek() == '(' && ch == ')') ||
                                (st.peek() == '[' && ch == ']') ||
                                (st.peek() == '{' && ch == '}'))) {
                    st.pop(); // Pop the matched opening parenthesis
                } else {
                    System.out.println("Mismatch or extra closing parenthesis found!");
                    return false; // Mismatch or extra closing parenthesis
                }
            }
        }

        // If the stack is empty, all parentheses were matched
        return st.empty();
    }

    public static void main(String[] args) {
        String str = "(a+(b+c))"; // Test input string with parentheses and letters

        System.out.println(isBalanced(str)); // Output the result
    }
}
