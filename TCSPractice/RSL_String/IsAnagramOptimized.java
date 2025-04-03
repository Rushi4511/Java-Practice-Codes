class IsAnag{
	public static boolean isAnagram(String str1 ,String str2){

		if(str1.length() != str2.length()){
			return false;
		}

		int freq[] = new int[26];

		for(int i=0;i<str1.length();i++){

			freq[(int)str1.charAt(i)-65]++;
		}
		for(int i=0;i<str2.length();i++){

			freq[(int)str2.charAt(i)-65]--;
		}

		for(int i =0;i<26;i++){

			if(freq[i] != 0)
				return false;

		
		}
		return true;
	}
	public static void main(String[] args){

		String str1 = "ACT";
		String str2 = "CAT";

		System.out.println(isAnagram(str1,str2));


	}
}

	
