import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("enter the number in array : ");
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter the element that you want to find in array  : ");
        int flage=sc.nextInt();
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==flage){
                f=1;
                System.out.println("element is presnrt at index :"+i);
                break;
            }

        }
        if(f==0)
        {

     
        System.out.println("Elemnt is not present in array : ");
    }
        
    }
}
