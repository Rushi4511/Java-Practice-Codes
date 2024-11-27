class Pr8{
	public static void main(String []args){
		int row=3;
		for(int i=1;i<=row;i++){
			char ch='c';
			for(int j=1;j<=row;j++){
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
