class RevStatement{
	

	public static String revStatement(String str){ 

		String result ="";
		String word = "";


		for(int i = str.length()-1 ;i>=0;i--){
			char ch = str.charAt(i);

			if(ch == '.'){

				if(!result.isEmpty())
					result += ".";

				result += word;
				word ="";

			}else{
				word = ch + word;
			}
		
		}

		if(!result.isEmpty())
			result += ".";

		result += word;

		word = "";

		return result;

	}

	public static void main(String[] args){
		String str = "i.like.this.program.very.much";

		System.out.println(revStatement(str));
	}
}
