import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            int val=row*(row-i+1);
            int temp=val;
            for(int j=1;j<=row;j++)
            {
                if(i==j)
                {
                    System.out.print("@\t");
                }
                else
                {
                    System.out.print(val+"\t");
                    
                

                }
                temp=temp-2;
                val=val+temp;
            }
            System.out.println();
        }
    }
}
