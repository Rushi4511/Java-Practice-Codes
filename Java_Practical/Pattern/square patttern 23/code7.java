import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int val=sc.nextInt();
       int row=val;
       for(int i=1;i<=val;i++){
        for(int j=1;j<=val;j++){
            if(i%2==1 && j%2==1){
                System.out.print(row*row-1+"\t");
                
            }
            else if(i%2==1)
            {
                System.out.print(row*row+"\t");
            }
            else
            {
                System.out.print(row*row+"\t");
            }
            row++;

        }
        System.out.println();
       }
        
    }
}
