import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        int arr[]={11,33,44,55,32,2,11,33,11};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number to check :");
        int val=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
                if(count>2){
                    System.out.println("Elemnt occure more then three  times in the array.");
                    break;
                }
            }
            
        }
        if(count==2){
            System.out.println("Elemnt occure more then two  times in the array.");
        }
       
    }
    
}
