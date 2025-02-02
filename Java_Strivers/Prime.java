import java.util.*;

class Prime{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		int count=0;
		for(int i=1;i<=num/2;i++){

			
			if(num%i==0){
				count++;
			}
		}

		if(count<2){
			System.out.println(num+" is a Prime Number");
		}else if(num==2){
			System.out.println(num+ " is neither Prime nor Composite");
			
		}else{
			System.out.println(num+" is not a Prime Number");
		}
	}
}
