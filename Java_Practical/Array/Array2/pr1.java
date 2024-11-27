import java.util.Arrays;
import java.util.Scanner;

public class pr1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            {
                System.out.println("Enter "+(i+1)+" element :");
                arr[i]=sc.nextInt();

            }
        Arrays.sort(arr);
        System.out.print("Maximum elemnet in array is : ");
        System.out.println(arr[size-1]);

        
    }

}
