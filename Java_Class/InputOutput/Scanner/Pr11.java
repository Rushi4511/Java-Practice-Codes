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
                float cgpa=sc.nextFloat();

		System.out.println("Name : "+name);
		System.out.println("College name : "+clgName);
		System.out.println("Student ID: "+stdId);
		System.out.println("CGPA : "+cgpa);
        }
}

