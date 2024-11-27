class Pr16{
	public static void main(String []args){
		for(int i=1;i<=5;i++){
			if(i%2==1){
				for(int j=1;j<=3;j++){
					System.out.print(j+" ");
				}
			}else{
				for(int j=3;j>=1;j--){
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
