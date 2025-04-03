class RemBrackets{
	public static void main(String[] args){

		String str = "a+((b-c)+d)";

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch == '(' || ch == ')' || ch == '{' || ch == '}'){

				str = str.substring(0,i)+ str.substring(i+1);
				i--;
			}
			

		}
		System.out.println(str);
	}
}
