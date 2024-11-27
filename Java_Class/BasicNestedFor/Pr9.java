import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row count: ");
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(num++ +" ");
			}
			num-=1;
			System.out.println();
		}
	}
}
