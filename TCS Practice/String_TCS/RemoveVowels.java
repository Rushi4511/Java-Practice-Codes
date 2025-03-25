class RemoveVowel{
	public static void main(String[] args){

		String str = "My Name is Rushi";

		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U'){

				str = str.substring(0,i) + str.substring(i+1);
				i--;
			}
		}

		System.out.println(str);
		
	}
}
