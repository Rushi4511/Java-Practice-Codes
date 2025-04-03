import java.util.*;


class Palindrome{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String rev = "";

		char ch;


		for(int i =0;i<str.length();i++){

			ch = str.charAt(i);
			rev = ch + rev;
		}

		if(str.equals(rev)){
			System.out.println("String "+str+" is Palindrome");
		}else{

			System.out.println("String "+str+" is not Palindrome");
		
		}
		System.out.println(rev);

	}
}

