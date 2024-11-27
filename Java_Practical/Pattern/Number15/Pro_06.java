import java.util.Scanner;

class Pro_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int copy = num;
        int rev = 0;

        while( copy > 0 ) {
            int temp = copy % 10;
            rev = temp + (rev * 10) ;
            copy /= 10;
        }
        if( num == rev ){
            System.out.println(num+" is a Palindrome Number.");
        }else{
            System.out.println(num+" is not a Palindrome Number");
        }
    } 
}
