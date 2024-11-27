
import java.util.*;
public class code4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number ! ");
        int num=sc.nextInt();
        int mul=1;
        if(num==0)
        {
            System.out.println("the factorial of 1 is 1 ");
        }
        else
        {

     
        while(num!=0)
        {
            mul*=num;
            num--;

       }
    }
        System.out.println("the factorial  is "+ mul);

        
    }
    
}
