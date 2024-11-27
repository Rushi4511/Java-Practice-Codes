import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        char ch=(char)(96+row);
        int val=row;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){
                if(i%2==1)
                {
                    if(j%2==1)
                    {
                        System.out.print(ch +"\t");
                        
                    }
                    else
                    {
                        System.out.print(val+"\t");
                    }

                }
                else
                {
                    if(j%2==0)
                    {
                        System.out.print(ch+"\t");
                        
                    }
                    else
                    {
                        System.out.print(val+"\t");
                    }

                }
                ch++;
                val++;


            }
            System.out.println();
        }

    }
}
