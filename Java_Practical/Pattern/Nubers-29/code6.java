import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        
        System.out.println("enter how man nuber you want to generate ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<size;i++){
             arr[i]=arr[i-1]+arr[i-2];



        }
        System.out.println("fibonachi serires upto  "+size+" numbers are :");
        for(int val:arr){
            System.out.print(val+"\t");
        }
    }
    
}
