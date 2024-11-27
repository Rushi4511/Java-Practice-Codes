import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Nuber ! ");
        int val=sc.nextInt();
        int temp=val;
        int ans=0;
        while (val>0){
            int f=1;
            int rem=val%10;
            for(int i=1;i<=rem;i++){
                f=f*i;

            }
            System.out.println(f);
            ans+=f;
            val/=10;
            
        }
        System.out.println(ans);
        if(ans==temp){
            System.out.println(temp+" it is an Strong number ! ");
        }
        else
        {
            System.out.println(temp+" is not an strong number ! ");
        }
    }
    
}
