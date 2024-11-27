import java.util.Scanner;

public class code1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
       int arr[]= new int[size];
       System.out.println("Enter the elemnts in array :");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       int sum=0;
       for(int val:arr){
        sum=sum+val;
       }
       System.out.println("the average of elemnts is : "+(sum/size));
       



        
    }

    
}