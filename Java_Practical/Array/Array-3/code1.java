import java.util.Scanner;

public class code1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size of Array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+15;

        }
        for(int val:arr){
            System.out.print(val+" ");
        }
        

    }
}