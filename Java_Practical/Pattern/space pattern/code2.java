import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row;j>=1;j--)
            {
                if(j>i){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
    
}