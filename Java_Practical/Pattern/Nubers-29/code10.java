import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        System.out.println("enter your number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        int temp=num;
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        int size=sb.length();
        while(num>0){
            int rem=num%10;
            ans=ans+(int)(Math.pow(rem,size));
            num/=10;
        }
        if(ans==temp){
            System.out.println(ans+" is an armstrong number !");

        }
        else
        {
            System.out.println(temp+" is not an armstring number ! ");
        }
    }
}
