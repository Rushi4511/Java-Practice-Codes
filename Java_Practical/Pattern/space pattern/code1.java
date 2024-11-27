import java.util.*;

public class code1 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int row = sc.nextInt();
        // with three loops
//         for (int i = 1; i <= row; i++) {
//             for (int sp = 1; sp <= row - i; sp++) {
//                 System.out.print(" ");

//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }



// with two loops 
        for(int i=1;i<=row;i++){
            int val=1;
            for(int j=4;j>=1;j--)
            {
               
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(val++);

                }

            }
            System.out.println();
        }
}

 }

