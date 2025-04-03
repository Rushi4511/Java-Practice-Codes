class RemoveVowel{
	public static void main(String[] args){

		String str = "My Name is Rushi";

		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch == ' '){

				str = str.substring(0,i) + str.substring(i+1);
				i--;
			}
		}

		System.out.println(str);
		
	}
}
