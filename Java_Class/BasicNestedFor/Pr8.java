import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number count: ");
		int row=sc.nextInt();
		int ch=64+row;
		int num=1;
		for(int i=1;i<=row;i++){	
			for(int j=1;j<=row;j++){
				System.out.print((char)ch+""+num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
