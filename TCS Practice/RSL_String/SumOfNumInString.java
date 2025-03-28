import java.util.*;

class SumOfNumInString{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String tempSum = "0";

		int sum =0;

		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);

			if(Character.isDigit(ch)){

				tempSum = tempSum + ch;
			}else{
				sum = sum+Integer.parseInt(tempSum);
				tempSum ="0";
			}

		}
		sum =sum+Integer.parseInt(tempSum);
		System.out.println(sum);
	}
}
