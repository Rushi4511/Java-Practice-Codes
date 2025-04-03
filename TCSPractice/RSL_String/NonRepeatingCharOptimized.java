class NonRepChar{

	public static void main(String[] args){

		String str = "Take U Forward";

		int N = str.length();
		int freq[] = new int[200];

		char s[] = str.toCharArray();

		for(int i =0;i<N;i++){

			if(s[i] == ' '){
				continue;
			}
			else{
				freq[(int)str.charAt(i)]++;

			}
		}
		for(int i =0;i<N;i++){

			if(freq[(int) str.charAt(i)] == 1 && s[i] != ' '){

				System.out.print(s[i] + " ");
			}
		}
	}
}
