package Recursion;

class SumOfDigits {
    int sum = 0;

    // Method 1
    int fun1(int num) {
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    // Method 2
    int sum1 = 0;

    int fun2(int num) {
        for (; num > 0; num = num / 10) {
            sum1 = sum1 + (num % 10);
        }

        return sum;
    }

    // Method 3
    int fun3(int num) {
        if (num == 0)
            return 0;
        return num % 10 + fun3(num % 10);
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        SumOfDigits obj = new SumOfDigits();

        int ret1 = obj.fun1(128);
        System.out.println(ret1);

        int ret2 = obj.fun2(128);
        System.out.println(ret2);

        int ret3 = obj.fun2(128);
        System.out.println(ret3);

        System.out.println("End Main");
    }
}