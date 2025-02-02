import java.lang.Math;
import java.util.*;

class Armstrong{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int temp1 = num;
		int temp2 =num;

		int count=0;
		while(temp1!=0){
			temp1 =temp1 /10;
			count++;
		}


		int mod =0;
		double armNum=0;
		while(temp2!=0){
			mod = temp2%10;
			armNum =armNum + Math.pow(mod,count);
			temp2 = temp2/10;

		}


		if (armNum == num){
			System.out.println("Number is ArmStrong Number");
		}else{
			System.out.println("Number is Not ArmStrong Number");
		}
	}
}

