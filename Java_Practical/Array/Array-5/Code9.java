import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            int val=sc.nextInt();
            arr[i]=val+1;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    
}
