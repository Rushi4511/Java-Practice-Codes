class demo2{
	public static void main(String[] args){
		int num=2569185;
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%3!=0){
				System.out.println(rem);
			}
		}
	}
}

