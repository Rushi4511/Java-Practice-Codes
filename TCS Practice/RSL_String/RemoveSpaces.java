class RemSpaces{

	public static void main(String[] args){
	String str = "Take U Forward";

	for(int i =0;i<str.length();i++){

		char ch = str.charAt(i);

		if(ch == ' '){

			str = str.substring(0,i)+str.substring(i+1);

		}
		

	}
	System.out.println(str);
	}
}
