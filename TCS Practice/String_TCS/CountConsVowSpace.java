import java.util.*;

class CountVowelSp{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int vowels = 0;
		int consonants = 0;
		int spaces = 0;

		String str = sc.nextLine();
		str = str.toLowerCase();

		System.out.println(str);

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels++;
			}else if(ch >= 'a' && ch <= 'z'){
				consonants++;
			}else if(ch == ' '){
				spaces++;
			}
		}

		System.out.println("Vowels: "+vowels);  
		System.out.println("Consonants: "+consonants);  
		System.out.println("Spaces: "+spaces);  
	};  
}
