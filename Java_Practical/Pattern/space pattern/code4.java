import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            int val=row;
            for(int j=row;j>=1;j-- ){
                if(j>i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(val+" ");
                    val+=row;
                }

            }
            System.out.println();
        }
    }
}
