import java.util.Scanner;

public class code4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int val=sc.nextInt();
        int sum=0;
        for(int i=1;i<val;i++){
            if(val%i==0){
                sum+=i;
            }
            
        }
        if(sum>val){
            System.out.println(val+" is abunandant number  ");
        }
        else
        {
            System.out.println("not is abunandant number ! ");
        }
        
    }
}
