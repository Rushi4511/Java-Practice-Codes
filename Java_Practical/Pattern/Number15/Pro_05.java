import java.util.Scanner;

class Pro_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Reverse of "+num+" is ");
        while( num > 0 ) {
            int temp = num % 10;
            System.out.print(temp); 
            num /= 10;
        }

        /*  
        int copy = num;
        int rev = 0;

        while( copy > 0 ) {
            int temp = copy % 10;
            rev = temp + (rev * 10) ;
            copy /= 10;
        }
        System.out.println(rev);
         */
    } 
}
