import java.util.*;
class Pr2{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		if(age>0 && age<18){
			System.out.println("Voter is not eligible for voting ");
		}else if(age>=18 && age<=100){
			System.out.println("Voter is eligible for voting");
		}else{
			System.out.println("Invalid age");
		}
	}
}
