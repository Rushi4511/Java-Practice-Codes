import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int val=row;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
               if(i%2==0){
                System.out.print(val+"\t");
               }
               else
               {
                if(j%2==0)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print(val+"\t");
                    val++;
                }


               }
            }
            System.out.println();
        }


        
    }
}
