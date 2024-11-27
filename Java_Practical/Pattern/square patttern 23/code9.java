import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int val=1;
        for(int i=1;i<=row;i++){
            if(i==1 || i==row){
                 val=row*row;
            }
            else
            {
                if( row%2==1)
                {
                    val=row*(row+1);
                }
                else
                {
                     val=row*(row+2);
                }
            }
            for(int j=1;j<=row;j++){
               if(j%2==0)
               {
                System.out.print("@\t");

               }
               else
               {
        
                System.out.print(val+"\t");
                val=val-(i*2);
                

               }
               
            }
            

            System.out.println();
        }
    }
}
