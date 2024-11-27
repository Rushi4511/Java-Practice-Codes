import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{

		File fobj=new File("Incubators.txt");

		fobj.createNewFile();
		File dirObj=new File("JAVA2024");
		dirObj.mkdir();
		File fObj2=new File(dirObj,"Core2Web.txt");
		fObj2.createNewFile();
	}
}
