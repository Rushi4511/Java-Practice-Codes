import java.util.*;

class ReverseString{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev = "";

		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);
			if(ch == ' '){
				ch = '.';
			}

			rev = ch +rev;

		}
		System.out.println(rev);


		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}


