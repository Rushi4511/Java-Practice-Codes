import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter size of Array : ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elemnet of array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        if(size%2==1)
        {
            for(int val:arr){
                System.out.println(val);
            }
        }
        else
        {
            for(int i=0;i<size;i++){
                if(i%2==0){
                    continue;
                }
                else
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    
}
