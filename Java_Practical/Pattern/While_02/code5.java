class demo5{
	public static void main(String[] args){
		int num=256985;
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==0){
				System.out.println(rem*rem*rem);
			}
		}
	}
}

