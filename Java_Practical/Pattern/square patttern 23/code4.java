import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i%2==1){
                    System.out.print("& \t");
                }
                else
                {
                    if(j%2==1){
                        System.out.print("&\t");
                    }
                    else
                    {
                        System.out.print("$\t");
                    }
                }
            }
            System.out.println();
        }

    }
    
}
