class Pr19{
	public static void main(String []args){
		//1 2 3 4
		//4 3 2 1
		//1 2 3 4
		//4 3 2 1
		int row=5;
		for(int i=1;i<=row;i++){
			if(i%2==1){
				for(int j=1;j<=4;j++){
					System.out.print(j+" ");
				}
			}else{
				for(int j=4;j>=1;j--){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
	}
}
