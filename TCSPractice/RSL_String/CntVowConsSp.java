import java.util.*;
class Count{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.toLowerCase();

		System.out.println(str);

		int consonants =0,vowels =0,spaces=0;


		for(int i =0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch =='a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
				vowels++;

			}
			else if(ch >= 'a' && ch <= 'z'){

				consonants++;
			}

			else if(ch == ' '){

				spaces++;
			}

		}

		System.out.println("Vowels: "+vowels+ ",Consonants:"+consonants+ ",Spaces:"+spaces);
	}
}	


