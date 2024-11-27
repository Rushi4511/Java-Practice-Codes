import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        System.out.println("Enter the total number of followers  : ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("emter name of follower : ");
            arr[i]=sc.next();
        }
        System.out.println("the name of followes are as follow : ");
        for(String val:arr)
        {
            System.out.print(val+"  ");
        }
        
    }
}
