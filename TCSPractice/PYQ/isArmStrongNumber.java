package Arrays.PYQ;
import java.util.*;

class IsArmStrongNumber{

	public static int power(int rem ,int digitCount){
		
		int result  = 1;

		for(int i =0;i<digitCount;i++){

			result = result*rem;

		}
		return result;

	}

	public static boolean isArmStrong(int n){

		int digitCount = 0;
		int arm =0;
		int temp = n;

		while(temp!=0){

			temp = temp/10;
			digitCount++;
		}

		temp = n;

		while(temp!=0){

			int rem = temp%10;
			arm = arm + power(rem,digitCount);
			temp = temp /10;
		}


		return arm == n;

		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(isArmStrong(n));

	}
}

