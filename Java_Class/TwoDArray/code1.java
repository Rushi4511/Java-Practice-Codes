import java.util.Scanner;

public class code1{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
         int arr[][]=new int[2][];
          arr[0]=new int[2];
          arr[1]=new int[3];
          System.out.println("enter the arrat elements :");
          for(int i=0;i<arr.length;i++){2
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
          }
          System.out.println("Eleements in Array are : ");
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
          }
        //   arr[0][0]=1;



    }
}