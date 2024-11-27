import java.io.*;
class Demo{
        public static void main(String []args)throws IOException{
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);

                System.out.print("Enter name: ");
                String name=br.readLine();
                System.out.println("Name :"+name);

                System.out.print("Enter comp Name: ");
                String cmpName=br.readLine();
                System.out.println("Comp name: "+cmpName);

                System.out.print("Enter empId: ");
                int empId=Integer.parseInt(br.readLine());//wrapper class
                System.out.println("Emp Id: "+empId);

		System.out.print("Enter salary: ");
		double sal=Double.parseDouble(br.readLine());
		System.out.println("Emp Salary: "+sal);
	}
}


