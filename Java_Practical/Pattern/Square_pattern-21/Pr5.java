import java.util.*;
class Pr5{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(num%2==0){
					System.out.print(num*num+" ");
				}else{
					System.out.print(num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
/* 3 16 5
 * 36 7 64
 * 9 100 11
 * */
