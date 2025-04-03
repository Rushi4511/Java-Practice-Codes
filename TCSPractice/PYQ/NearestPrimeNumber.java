package Arrays.PYQ;
import java.util.*;

class NearestPrime{

	public static boolean isPrime(int n){

		if(n<=1){
			return false;
		}
		for(int i =2;i<Math.sqrt(n);i++){

			if(n%i ==0){
				
				return false;
			}
		}

		return true;


	}

	public static int nearestPrimeNumber(int n){
		
		int prime =0;
		for(int i = n-1 ;i>=2;i--){

			if(isPrime(i)){
				prime = i;
				break;
			}
		}
		return prime;

			
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(nearestPrimeNumber(n));
	}
}
