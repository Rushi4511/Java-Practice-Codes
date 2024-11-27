import java.util.*;
class Pr6{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(num%2==1){
					System.out.print(num*num+" ");
				}else{
					System.out.print(num+" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
/* 9 4 25
 * 6 49 8
 * 81 10 121 
 *
 *
 * 4 25 6 49
 * 8 81 10 121
 * 12 169 14 225
 * 16 289 18 361
 * */
