import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        char arr[]=new char[size];
        for(int i=0;i<size;i++){
            System.out.println("enter char  for element "+(i+1)+" :");
            arr[i]=sc.next().charAt(0);

        }
        System.out.println("elements in array are : ");
        for(char val:arr)
        {
            System.out.print(val+"  ");
        }

    }
}
