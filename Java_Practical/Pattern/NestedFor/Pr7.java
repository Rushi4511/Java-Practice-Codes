class Pr7{
	public static void main(String []args){
		int row=3;
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(j+""+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
