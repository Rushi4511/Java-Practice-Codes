class ReverseNumber{
	public static void main(String[] args){

		int num=4551;
		int rev =0;
		int mod =0;

		while(num!=0){
			mod = num%10;
			rev =rev*10 + mod;
			num =num/10;
		}

		System.out.println(rev);
	}
}
