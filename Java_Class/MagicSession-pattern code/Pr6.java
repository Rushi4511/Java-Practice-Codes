import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();

		for(int i=num1;i<=num2;i++){
			System.out.print(i+" ");
		}
	}
}
