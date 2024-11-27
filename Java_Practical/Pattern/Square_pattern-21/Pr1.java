import java.util.*;
class Pr1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter row: ");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
		int ch=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print((char)ch-- +" ");
				}else{
					System.out.print(row+" ");
				}	
			}	
			System.out.println();
		}
	}
}
