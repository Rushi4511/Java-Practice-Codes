import java.util.Scanner;
class ScannerDemo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=sc.next();
		System.out.print("Enter colg name: ");
		String clgName=sc.next();
		System.out.print("Enter stdId: ");
		int stdId=sc.nextInt();
		System.out.print("Enter CGPA: ");
		double cgpa=sc.next();
	}
}
