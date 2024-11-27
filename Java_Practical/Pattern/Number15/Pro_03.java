import java.util.Scanner;

class Pro_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int temp = 2;
        boolean composite = true;

        while(temp < num ) {
            if( num % temp == 0){
                composite = true;
            }
            temp++ ;
        }

        if( composite ){
            System.out.print(num+" is a Composite Number.");
        }else{
            System.out.print(num+" is not a Composite Number.");
        }
    }
}