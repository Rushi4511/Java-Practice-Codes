import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size=sc.nextInt();
        System.out.println("enter numbers in array : ");
        int key =5;
        int f=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt(); 

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                
                System.out.println("the first index of "+key+" is "+i);
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println(key +" is not present in the array");
        }
    }
}
