import java.util.HashMap;
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={11,22,33,11,22,44};
        int count=0;
        int index=-1;
        System.out.println("enter the element that you want to search ");
        int se=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==se)
            {
                if(count==0)
                {
                    index=i;
                }
                count++;

            }
        }
        System.out.println("The element "+se+" occure "+count+" times and firstly occure at index "+index);

    }
    
    
}
