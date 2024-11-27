import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
    System.out.println("enter the nuber of rows ");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            char val=(char)(65+row-i);
            for(int j=row;j>=1;j--){
                if(j>i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(val++ +" ");
                }
            }
            System.out.println();
        }

    }
}
