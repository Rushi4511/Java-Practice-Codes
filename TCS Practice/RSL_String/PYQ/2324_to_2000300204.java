class Pattern2324{

	public static void main(String[] args){

		int num = 2324;

		int divisor = 1;

		while(num / divisor>= 10){

			divisor = divisor*10;
			
		}


		while(divisor!=0){

			int digit = num /divisor;

			System.out.println(digit*divisor);

			num = num %divisor;
			divisor = divisor/10;
		}
	}
}



