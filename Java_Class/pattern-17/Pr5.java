import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		if(num%16==0){
			System.out.println(num+" is present in 16 table");
		}else{
			System.out.println(num+" is not present in 16 table");
		}
	}
}
