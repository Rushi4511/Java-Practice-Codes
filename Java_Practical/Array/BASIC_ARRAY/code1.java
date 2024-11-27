import java.io.*;
public class code1{
    public static void main(String ar[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of array : ");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];
        System.out.println("enter values in array ");
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());

        }
        System.out.println("Elements in array are as follow : ");
        for(int val:arr)
        {
            System.out.print(val+"  ");

        }

    }
}