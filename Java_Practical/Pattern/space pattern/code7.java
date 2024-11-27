import java.util.Scanner;

public class code7 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows : ");
            int row=sc.nextInt();
            for(int i=1;i<=row;i++){
                int val=1;
                for(int j=1;j<=row;j++){
                    if(j<i){
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print(val++ +" ");
                    }
                }
                System.out.println();
            }
            
        }    
}
