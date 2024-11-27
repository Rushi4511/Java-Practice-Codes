import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("enter the elements in Array : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int val:arr){
            if(val%3==0){
                System.out.print(val+"\t");
            }
            
        }
    }
}
