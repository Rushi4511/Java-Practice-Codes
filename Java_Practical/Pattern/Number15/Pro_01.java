import java.util.Scanner;

class Pro_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Factors of "+num+" are ");

        for(int i = 1; i <= num; i++) {
            if( num % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}