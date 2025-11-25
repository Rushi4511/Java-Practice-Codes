import java.util.Stack;

public class Tester {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String expr) {
		//0. create stack to push operands 
		Stack<Integer> st = new Stack<Integer>();
		//1. traverse expression fron left to right
		for(int i = 0 ; i < expr.length() ; i++) {
			//2. extract element of ith index
			char ele = expr.charAt(i);
			//3. if element is operand
			if(Character.isDigit(ele))
				//4. push element on stack
				st.push(ele - '0');		// to convert character into number
			//5. if element is operator
			else {
				//6. pop two operands from stack
				int op2 = st.pop();
				int op1 = st.pop();
				//7. perform operation of op1 and op2
				int res = calculate(op1, ele, op2);
				//8. push result on stack
				st.push(res);
			}
		}
		//9. pop single value from stack and return it
		if(!st.isEmpty())
			return st.pop();
		
		return 0;	
	}
	
	public static int prefixEvaluate(String expr) {
		//0. create stack to push operands 
		Stack<Integer> st = new Stack<Integer>();
		//1. traverse expression from right to left
		for(int i = expr.length() - 1 ; i >= 0 ; i--) {
			//2. extract element of ith index
			char ele = expr.charAt(i);
			//3. if element is operand
			if(Character.isDigit(ele))
				//4. push element on stack
				st.push(ele - '0');		// to convert character into number
			//5. if element is operator
			else {
				//6. pop two operands from stack
				int op1 = st.pop();
				int op2 = st.pop();
				//7. perform operation of op1 and op2
				int res = calculate(op1, ele, op2);
				//8. push result on stack
				st.push(res);
			}
		}
		//9. pop single value from stack and return it
		if(!st.isEmpty())
			return st.pop();
		
		return 0;	
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";
		
		System.out.println("Prefix : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);
		
		
		

	}

}
