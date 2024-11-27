import java.util.*;
public class code2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number ! ");
        int num=sc.nextInt();
        int f=0;
        if(num<=1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    System.out.println("not prime");
                    f=1;
                    break;

                }
            }
            if(f==0)
            {
                System.out.println("prime ");
            }
        }
        
    }
}