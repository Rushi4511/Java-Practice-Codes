class NonRepChar{

	public static void main(String[] args){

		String str = "Take U Forward";

		int N = str.length();

		int freq[] = new int[N];
		char s[] = str.toCharArray();

		for(int i =0;i<N;i++){

			freq[i] = 1;

			for(int j =i+1;j<N;j++){

				if(s[i] == s[j]){

					freq[i]++;

					s[j] = '-';
				}
			}
		}

		for(int i=0;i<N;i++){

			if(freq[i]==1 && s[i]!= ' ' && s[i] != '-'){

				System.out.print(s[i]+" " );
			}
		}
	}
}
