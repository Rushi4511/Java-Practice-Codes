import java.io.*;
class Demo{
	public static void main(String []args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter name: ");
		String name=br.readLine();
		System.out.println("Name : "+name);

		System.out.print("Enter company name: ");
		String cmpName=br.readLine();
		System.out.println("Company Name: "+cmpName);
	}
}
