import java.util.*;
class Pr3{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();

		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
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
/* 9 4 5
 * 36 7 8
 * 81 10 11
 * */
