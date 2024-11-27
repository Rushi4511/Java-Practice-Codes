import java.util.*;
public class Code6 {
    public static void main(String[] args) {
        int arr[]={2,44,22,98};
        int f1=0;
        for(int val:arr){
            int f=0;
            if(val<2)
            {
                continue;
            }
            for(int i=2;i<=Math.sqrt(val);i++)
            {
                if(val%i==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                f1=1;
                System.out.println("The first prime number is  "+val);
                break;
            }

        }
        if(f1==0)
        {
            System.out.println("there is no prime number in Array  : ");
        }

    }
}
