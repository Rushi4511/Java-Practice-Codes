import java.util.Scanner;

public class code3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){

   
            System.out.println("Enter  element "+(i+1)+" :");
            arr[i]=sc.nextInt();

        }
        System.out.println("Element in the array are as follow : ");
        for(int val: arr){
            System.out.print(val+"  ");
        }
        
    }
}