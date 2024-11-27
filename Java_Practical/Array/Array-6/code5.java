import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        int arr[]={11,22,45,66,45,22};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your  element to search : ");
        int val=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%val==0)
            {
                System.out.println("The multiple of "+val+" is present at index "+i);
            }
        }
        
    }
}
