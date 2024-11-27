import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        char arr[]=new char[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("Elements in array are :");
        for(char ch:arr)
        {
            System.out.println(ch);
        }

    }
    
}
