class RemCharExAlpha{

	public static void main(String[] args){

		String str = "$$take U Forwa**rd";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			
			char ch = str.charAt(i);

			int ascii = ch;

			if((ascii >= 65 && ascii <= 90 ) || (ascii >= 97 && ascii <= 122)){

				sb = sb.append(ch);

			}
		}
		System.out.println(sb.toString());
	}
}
