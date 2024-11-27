import java.util.*;
public class code7 {
    public static void main(String[] args) {
        System.out.println("enter you number : ");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int num=0;
        while(val>0)
        {
            int rem=val%10;
            num=rem+num*10;
            val/=10;


        }
        System.out.println(num);
    }
    
}
