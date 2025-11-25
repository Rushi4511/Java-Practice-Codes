import java.util.Stack;

public class Tester {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '*': return 9;
		case '/': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;		
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		//0. create stack to push operator
		Stack<Character> st = new Stack<Character>();
		//0. create string to store postfix expression
		StringBuilder postfix = new StringBuilder();
		//1. traverse infix expression from left to right
		for(int i = 0 ; i < infix.length() ; i++) {
			//2. extract element of ith index
			char ele = infix.charAt(i);
			//3. if element is operand
			if(Character.isDigit(ele))
				// append it into postfix expression
				postfix.append(ele);
			//4. if element is '('
			else if(ele == '(')
				// push it on stack
				st.push(ele);
			//5. if element is ')'
			else if(ele == ')') {
				// pop and append one by one till '('
				while(st.peek() != '(')
					postfix.append(st.pop());
				// discard '(' and ')'
				st.pop();
			}
			//6. if element is operator
			else {
				//7. check priority of topmost element
				while(!st.isEmpty() && priority(st.peek()) >= priority(ele)) 
					postfix.append(st.pop());
				//8. push current operator on stack
				st.push(ele);
			}
		}
		//9. pop and append till stack is not empty
		while(!st.isEmpty())
			postfix.append(st.pop());
		//10. return postfix expression
		return postfix.toString();
	}

	public static void main(String[] args) {
		
		String infix = "1$9+3*4-(6+8/2)+7";

		System.out.println("Infix : " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);

	}

}
