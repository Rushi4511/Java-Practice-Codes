import java.util.*;
public class code8 {
    public static void main(String[] args) {
        System.out.println("enter you number : ");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int temp=val;
        int num=0;
        while(val>0)
        {
            int rem=val%10;
            num=rem+num*10;
            val/=10;


        }
        if(temp==num)
        {
            System.out.println("palindrome ");
        }
        else
        {
            System.out.println("no palindrome ");
        }
    }
    
}

