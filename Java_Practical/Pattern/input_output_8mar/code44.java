import java.util.*;
public class code44{
    public static int factorial(int num)
    {
        if(num==0 || num==1)
        {
           
            return 1;
        }
        else
        {
          return num*factorial(num-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number : ");
        int val=sc.nextInt();
    
        int facto=factorial(val);
        System.out.println("The factorial of "+val+" is "+ facto );

        
    }
}