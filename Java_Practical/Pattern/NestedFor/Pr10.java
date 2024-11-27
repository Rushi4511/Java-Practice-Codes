class Pr10{
	public static void main(String []args){
		int row=4;
		int start=1,end=4;
		for(int i=1;i<=row;i++){
			for(int j=start;j<=end;j++){
				System.out.print(j+" ");
			}
			System.out.println();
			start+=3;
			end+=3;
		}
	}
}
