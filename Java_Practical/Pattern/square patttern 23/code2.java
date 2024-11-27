import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row=sc.nextInt();
        int val=96+row;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row;j++){
                if(i>j)
                {
                    System.out.print((char)val+"\t");
                }
                else
                {
                    System.out.print((char)(val-32)+"\t");

                }
                val++;
            }
            System.out.println();
        }
    }
}
