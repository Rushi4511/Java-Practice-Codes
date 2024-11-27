import java.util.*;
class Pr8{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter row: ");
                int row=sc.nextInt();

                int num=row;
	
                for(int i=1;i<=row;i++){
                	int ch=64+row;
			for(int j=1;j<=row;j++){
				
				if(i%2==1){
					if(j%2==1){
						System.out.print("# ");
					}else{
						System.out.print((char)ch+" ");
						ch--;		
					}	
				}else{
					if(j%2==1){
						System.out.print((char)ch+" ");	
						ch--;
					}else{
						System.out.print("# ");
					}
				}
                        }
                        System.out.println();
                }
        }
}
/* # C #
 * C # B
 * # C #
 *
 *
 * # D # C
 * D # C #
 * # D # C
 * D # C # 
 * */
