import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number ");
        int number=sc.nextInt();
        int sqr=number*number;
        StringBuilder sb1=new StringBuilder();
        sb1.append(number);
        StringBuilder sb2=new StringBuilder();
        sb2.append(sqr);
       int l1=sb1.length();
       int l2=sb2.length();
       int ans=(l2-l1);
       System.out.println(ans);
       String str1=sb2.substring(ans);
       if(str1.equals(sb1.toString()))
       {
        System.out.println(number+" is Automorphic number ! ");
       }
       else
       {
        System.out.println("Not a automorphic number ! ");
       }
       

        
    }
}
