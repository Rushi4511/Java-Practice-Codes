import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        // int arr[]={96,65,48,55,32,67};
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        char arr[]=new char[size];
        System.out.println("Enter number from 1  to 100");
        for(int i=0;i<arr.length;i++){
            arr[i]=(char)(sc.nextInt());
            
            

        }
        for(char  val:arr){
            System.out.print(val+"  ");
        }
    }
}
