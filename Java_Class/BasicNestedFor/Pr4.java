import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row number: ");
		int row=sc.nextInt();
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(ch+" ");
				ch+=2;
			}
			System.out.println();
		}
	}
}
