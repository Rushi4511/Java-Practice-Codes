import java.util.Scanner;

class Pro_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int temp = 2;
        boolean prime = true;

        while(temp < num ) {
            if( num % temp == 0){
                prime = false;
            }
            temp++ ;
        }

        if( prime ){
            System.out.print(num+" is a Prime Number.");
        }else{
            System.out.print(num+" is not a Prime Number.");
        }
    }
}