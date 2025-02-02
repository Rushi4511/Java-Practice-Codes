import java.util.*;

class GCDofNumber{


	static int minNum(int num1,int num2){	
		if (num1<num2)
			return num1;
		else
			return num2;
	}
	public static void main(String[] args){

		GCDofNumber obj = new GCDofNumber();

		Scanner sc = new Scanner(System.in);

		int num1= sc.nextInt();
		int num2 =sc.nextInt();

		int GCD =1;
                
		System.out.println(obj.minNum(num1,num2));
	
	
	       	for(int i=1;i<obj.minNum(num1,num2);i++){

			if(num1%i==0 && num2%i==0){
				GCD = i;
			}
		}
		System.out.println(GCD);
	}
}


