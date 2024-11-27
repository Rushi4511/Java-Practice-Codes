class demo3{
	public static void main(String[] args){
		int num=436780521;
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==0 || rem%3==0){
				System.out.println(rem);
			}
		}
	}
}

