class demo6{
	public static void main(String[] args){
		int num=234;
		int rem=0;
		int prod=1;
		while(num>0){
			rem=num%10;
			num=num/10;
			prod=prod*rem;
		}
		System.out.println(prod);
	}
}

