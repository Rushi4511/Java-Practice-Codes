import java.io.*;

class BufferedReaderInput{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);


		int num = Integer.parseInt(br.readLine());
		System.out.println(num);

		double doubleNum = Double.parseDouble(br.readLine());
		System.out.println(doubleNum);

	}
}
