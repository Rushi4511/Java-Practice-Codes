import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        
        }
        for(int val:arr){
            if(val>5 && val<9)
            {
                System.out.println(val);
            }
        }
    }
}
