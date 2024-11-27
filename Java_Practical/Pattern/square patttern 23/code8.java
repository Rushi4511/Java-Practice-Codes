import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int val=row;
         char ch=(char)(96+row+1);
        for(int i=1 ;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i%2==1 && j%2==1)
                {
                    System.out.print(val*val-1+"\t");


                }
                else if(i%2==1)
                {
                    System.out.print(ch+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
                ch++;
                val++;

            }
            System.out.println();
        }

    }
}
