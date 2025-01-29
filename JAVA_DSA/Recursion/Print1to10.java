package Recursion;

public class Print1to10 {

    void numberPrint(int num) {

        if (num == 0) {
            return;
        } else {
            numberPrint(num - 1);
            System.out.println(num);
        }

    }

    void numberPrintDec(int num){
        if(num == 11)
            return;
        else
            numberPrintDec(num+1);
            System.out.println(num);
    }

    public static void main(String[] args) {
        Print1to10 obj = new Print1to10();
        obj.numberPrint(10);
        obj.numberPrintDec(1);
    }

}
