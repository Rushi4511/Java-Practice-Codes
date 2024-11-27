import java.util.*;
class Pr4{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter row: ");
                int row=sc.nextInt();

                int num=row;
                char ch=(char)(64+row);
		for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                if(j==1){
                                        System.out.print(ch+" ");
                                }else{
                                        System.out.print(num +" ");
                                }
				ch++;
                                num++;
                        }
                        System.out.println();
                }
        }
}
/* C 4 5
 * F 7 8
 * I 10 11
 * */
