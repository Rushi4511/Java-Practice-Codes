class Pr11{
	public static void main(String []args){
		//A b C D e F g H
		char ch1='A';
		char ch2='a';
		for(int i=1;i<=8;i++){
			if(i%2==1){
				System.out.print(ch1+" ");
				ch1+=2;
			}else{
				System.out.print(ch2+" ");
				ch2+=2;
			}
		}
	}
}
