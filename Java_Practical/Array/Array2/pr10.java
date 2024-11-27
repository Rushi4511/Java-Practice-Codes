import java.util.Arrays;
import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            

        }
        Arrays.sort(arr);
        System.out.println("the maximum element in array is : "+arr[size-1]);
    }
    
}
