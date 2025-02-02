import java.util.*;

class Divisors{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();

		for(int i =1;i<=num;i++){

			if(num%i==0){
				if(i==num){
					System.out.print(i);
				}else{
					System.out.print(i+",");
				}
			}
		}
	}
}
