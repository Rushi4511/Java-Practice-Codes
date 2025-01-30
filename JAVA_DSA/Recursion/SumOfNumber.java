package Recursion;

public class SumOfNumber {
    int sum = 0;

    int fun1(int num) {
        if (num == 1)
            return 1;

        return num + fun1(--num);
    }

    int fun2(int num) {
        if (num == 0) {
            return 1;

        }
        sum = sum + num;
        fun2(--num);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        SumOfNumber obj = new SumOfNumber();

        int ret1 = obj.fun1(2);
        System.out.println(ret1);

        int ret2 = obj.fun2(2);
        System.out.println(ret2);

        System.out.println("End Main");
    }
}