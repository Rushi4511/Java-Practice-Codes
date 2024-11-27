import java.util.Scanner;

public class code1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int val=96+row;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j==1)
                {
                    System.out.print((char)(val-32)+"\t");
                    val++;


                }
                else
                {
                    System.out.print((char)(val)+"\t");
                    val++;
                }
                
            }
            System.out.println();
        }
    }
}