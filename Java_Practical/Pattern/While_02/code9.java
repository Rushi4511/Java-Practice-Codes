class demo9{
	public static void main(String[] args){
		int num=2469185;
		int rem=0;
		int sum=0;
		int sq=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==1){
				sq=rem*rem;
				sum=sum+sq;
			}
		}
		System.out.println(sum);
	}
}

