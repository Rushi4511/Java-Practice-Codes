class Pr8{
	public static void main(String []args){
	// A 2 C 4 E 6 G 8 I
		char ch='A';
		for(int i=1;i<=9;i++){
			if(i%2==1){
				System.out.print(ch+" ");
				ch+=2;
			}else
				System.out.print(i+" ");
		}
	}
}
