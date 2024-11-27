class Pr10{
	public static void main(String []args){
		//9 B 7 D 5 F 3 H 1
		int num=9;
		char ch='B';
		for(int i=1;i<=9;i++){
			if(i%2==1){
				System.out.print(num+" ");
			}else{
				System.out.print(ch+" ");
				ch+=2;
			}
			num--;
		}
	}
}
