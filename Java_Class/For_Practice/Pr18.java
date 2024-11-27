class Pr18{
	public static void main(String []args){
		//1 2 3
		//D E F
		//7 8 9
		char ch='A';
		int num=1;
		for(int i=1;i<=4;i++){
			if(i%2==1){
				for(int j=1;j<=3;j++){
					System.out.print(num+" ");
					num++;
					ch++;
				}
			}else{
				for(int j=1;j<=3;j++){
					System.out.print(ch+" ");
					ch++;
					num++;
				}
			}
			System.out.println();
		}
	}
}
