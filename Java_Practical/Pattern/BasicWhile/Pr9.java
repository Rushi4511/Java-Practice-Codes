class Pr9{
	public static void main(String []args){
		int sum=0;
		int i=150;
		while(i>=101){
			if(i%2==1){
				sum=sum+i;		
			}		
			i--;
		}
		System.out.println(sum);
	}
}
