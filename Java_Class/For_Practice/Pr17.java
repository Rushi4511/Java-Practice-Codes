class Pr17{
	public static void main(String []args){
		//1 B 3
		//D 5 F
		//7 H 9
		char ch='B';
		int num=1;
		for(int j=1;j<=4;j++){
		if(j%2==1){
			for(int i=1;i<=3;i++){
				if(i%2==1){
					System.out.print(num+" ");
					num+=2;
				}else{
					System.out.print(ch+" ");
					ch+=2;
				}
			}
			System.out.println();
		
		}else{
			for(int i=1;i<=3;i++){
				if(i%2==1){
					System.out.print(ch+" ");
					ch+=2;
				}else{
					System.out.print(num+" ");
					num+=2;
				}
			}
			System.out.println();
		}
	}
	}
}
