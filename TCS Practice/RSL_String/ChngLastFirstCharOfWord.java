class ChangeLastAndFirstCharOfWord{
	public static void main(String[] args){

		String str = "My Name is Rushikesh karlE";

		StringBuilder sb = new StringBuilder(str);

		for(int i =0;i<str.length();i++){

			
			if(i==0 && (int)str.charAt(i)-32 >= 97){
				sb.setCharAt(i,(char)((int)str.charAt(i) -32));
			}
			if(i==(str.length()-1)  && (int)str.charAt(i) - 32 >=97 ){

				sb.setCharAt(i,(char)((int)str.charAt(i) -32));

			}else if(str.charAt(i) == ' '){
				if((int)str.charAt(i-1) -32 >=65){

					sb.setCharAt(i-1,(char)((int)str.charAt(i-1)-32));
				}
				if((int)str.charAt(i+1)-32 >=65){

					sb.setCharAt(i+1,(char)((int)str.charAt(i+1)-32));
				}
			}
		}
		System.out.println(sb.toString());
	}
}

