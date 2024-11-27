import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the of array : ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements in array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<size;i++){
            if(i%2==1){
                sum+=arr[i];
            }

        }
        System.out.println("addtion of all the elemnts at odd position is : "+sum);
        

    }
    
}
