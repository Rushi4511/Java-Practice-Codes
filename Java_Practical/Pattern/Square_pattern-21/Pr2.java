import java.util.*;
class Pr2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row;j++){	
				if(i%2==1){
					if(j%2==1){
						System.out.print(num*num+" ");
					}else{
						System.out.print(num+" ");
					}
				}else{
					if(j%2==1){
						System.out.print(num*i+" ");
					}else{
						System.out.print(num+" ");
					}
				}
				num++;
				}
			System.out.println();	
		}	
		}
	
}/* 9 4 25
   18 7 8 
   27 50 11
*/
