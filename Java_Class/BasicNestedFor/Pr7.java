import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row count: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch=96+row;
			for(int j=1;j<=row;j++){
				System.out.print((char)ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
