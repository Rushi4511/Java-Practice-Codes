import java.util.*;
class Pr7{
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter row: ");
                int row=sc.nextInt();

                int num=row;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                if(num%2==1){
                                        System.out.print((char)(64+i)+" ");
                                }else{
                                        System.out.print(num+" ");
                                }
                                num++;
                        }
                        System.out.println();
                }
        }
}
/* A 4 A
 * 6 B 8
 * C 10 C
 *
 *
 * 4 A 6 A
 * 8 B 10 B
 * 12 C 14 C
 * 16 D 18 D
 * */
