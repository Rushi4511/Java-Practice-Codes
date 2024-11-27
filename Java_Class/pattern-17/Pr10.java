import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sub1 marks: ");
		int m1=sc.nextInt();
		System.out.print("Enter sub2 marks: ");
		int m2=sc.nextInt();
		System.out.print("Enter sub3 marks: ");
		int m3=sc.nextInt();
		System.out.print("Enter sub4 marks: ");
		int m4=sc.nextInt();
		
		if(m1<=100 && m2<=100 && m3<=100 && m4<=100){
			int sum=m1+m2+m3+m4;
			System.out.println("Total marks: "+sum);
		}else{
			System.out.println("Invalid");
		}


	}
}
