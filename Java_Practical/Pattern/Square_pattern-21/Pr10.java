import java.util.*;
class Pr10{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			int num=row;
			int ch=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(num+" ");
					}else{
						System.out.print((char)ch+" ");
					}
					
				}else{
					System.out.print((char)ch+" ");
					
				}
				num--;				
				ch--;
			}
			System.out.println();
		}
	}
}

/* 3 B 1
 * C B A
 * 3 B 1
 *
 * 4 C 2 A
 * D C B A
 * 4 C 2 A
 * D C B A
 * */
