import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();
		int sum=0;
		for(int i=num1;i<=num2;i++){
			sum=sum+i;
		}
		System.out.println("Sum between "+num1+"&"+num2+" is: "+sum);
	}
}
