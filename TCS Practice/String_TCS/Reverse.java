class ReverseString{
	public static void main(String[] args){

		String str = "Geeks";

		String r = "";

		char ch;

		for(int i=0;i<str.length();i++){

			ch = str.charAt(i);
			r = ch + r;
		}
		System.out.println(r);
	}
}



