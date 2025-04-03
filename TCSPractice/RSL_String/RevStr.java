import java.util.*;
class Reverse{
	
	public static int isPalindrome(String str){

		String rev = "";

		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);

			rev = ch + rev;
		}

		System.out.println(rev);

		if(rev.equals(str)){
			return 1;
		}else{
			return 0;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int result = isPalindrome(str);

		if(result ==1){
			System.out.println("The Given String "+str+" is Palindrome");

		}else{
			System.out.println("The Given String "+str+" is not Palindrome");
		}
	}
}
			


