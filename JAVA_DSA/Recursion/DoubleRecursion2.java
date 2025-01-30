package Recursion;

class DoubleRecursion2 {

    void fun(int num) {
        if (num <= 1)
            return;
        fun(num - 2);
        System.out.println(num);
        fun(num - 1);

    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        DoubleRecursion2 obj = new DoubleRecursion2();
        obj.fun(5);
        System.out.println("End Main");
    }
}