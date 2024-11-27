class demo7{
	public static void main(String[] args){
		int num=256985;
		int rem=0;
		int sum=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==0){
				sum=sum+rem;
			}
		}
		System.out.println(sum);
	}
}

