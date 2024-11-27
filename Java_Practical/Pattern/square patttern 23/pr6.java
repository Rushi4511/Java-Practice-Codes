import java.util.Scanner;

public class pr6 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            int val = row * row;
            for (int j = 1; j <= row; j++) {
                if (i % 2 == 1) {
                    System.out.print(val-- + "\t");
                } else {
                    if (j == 1) {
                        System.out.print(val + "\t");
                        val -= 5;
                    } else {
                        if (j == row) {
                            val = val - 5;
                            if(val<0)
                            {
                                val=val+5;

                            }
                            System.out.print(val + "\t");

                        } else {
                            System.out.print(val + "\t");
                        }
                    }

                }
            }

            System.out.println();
        }
    }

}
