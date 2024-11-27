import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number ! ");
        int val=sc.nextInt();
        int temp=val;
        int sum=0;
        while(val>0)
        {
            int rem=val%10;
            sum=sum+rem*rem;
            val=val/10;


        }
        if(sum==1){
            System.out.println(temp+" is a happy number ! ");
        }
        else
        {
            System.out.println(temp+" is not a happy number");
        }
    }
}
