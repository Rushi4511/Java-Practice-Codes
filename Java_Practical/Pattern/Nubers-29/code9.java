import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        System.out.println("enter your number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            sum=sum+(temp%10);
            temp/=10;

        }
        if(num%sum==0){
            System.out.println(num+" is a Harshad number !");
        }
        else
        {
            System.out.println(num+" is not a Harshad number  number !");
        }
        
        
        
     
    }
}


