class CountDigits{
	public static void main(String[] args){
		int count =0;
		int num =4554;
		int count1=0;

		for(int i=num;num!=0;num =num/10){
			
			count++;
		}
		System.out.println(count);
		

		num =454545;
		while(num!=0){
			num= num/10;
			count1++;
		}
		System.out.println(count1);


	}
}
