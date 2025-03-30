import java.util.*;


class IsAnag{

	public static String sortString(String str,int N){
		char c[] = new char[N];

		Arrays.sort(c);
		return new String(c);

	}
	public static boolean isAnagram(String str1,String str2){

		if(str1.length() != str2.length())
			return false;

		
		str1 = sortString(str1,str1.length());
		str2 = sortString(str2,str2.length());


		for(int i=0;i<str1.length();i++){

			if(str1.charAt(i) != str2.charAt(i)){

				return false;
			}
		}

		return true;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		System.out.println(isAnagram(str1,str2));
	}
}
