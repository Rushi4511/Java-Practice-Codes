import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count of total employee : ");
        int count=sc.nextInt();
        int arr[]=new int[count];
        for(int i=0;i<count;i++)
        {
            System.out.println("enter the age of employee "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println("The age of Employee is as follow : ");
        for(int val:arr)
        {
            System.out.print(val+"  ");
        }

    }
}
