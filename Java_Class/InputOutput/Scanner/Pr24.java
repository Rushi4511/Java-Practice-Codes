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
		System.out.print("Comp name: "+cmpName);
		
		System.out.print("Enter empId: ");
		int empId=br.readLine();
		System.out.print("Emp Id: "+empId);
	}
}

