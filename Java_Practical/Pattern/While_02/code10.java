class demo10{
	public static void main(String[] args){
		int num=9367924;
		int rem=0;
		int sum=0;
		int prod=1;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==0){
				prod=prod*rem;
			}else{
				sum=sum+rem;
			}
		}
		System.out.println(sum);
		System.out.println(prod);
	}
}


