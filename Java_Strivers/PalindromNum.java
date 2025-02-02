import java.util.*;

class PalindromNum{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

		int num = sc.nextInt();
		int temp = num;

		int mod=0;
		int revNum =0;

		while(temp!=0){
			mod = temp%10;
			revNum = revNum*10+mod;
			temp=temp/10;
		}

		if(revNum==num){
			System.out.println("The Given Number "+num+" is Palindrome");
		}else{
			System.out.println("The Given number "+num+" is not plaindrome");
		
		}
		System.out.println(revNum);
	}
}


