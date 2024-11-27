import java.util.*;
public class code1{
  
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int val=sc.nextInt();
        for(int i=1;i<=val;i++)
        {
            if(val%i==0)
            {
                a1.add(i);

            }
        }
        System.out.println("Factors of "+ val +" is :"+a1);

        // int val=sc.nextInt();
    }
}