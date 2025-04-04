public class SumOfPrimeAndComposite {

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;

        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfPrime(int arr[]) {

        int sumPrime = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                sumPrime += arr[i];
            }
        }

        return sumPrime;
    }

    public static int sumOfNonPrime(int arr[]) {

        int sumNonPrime = 0;

        for (int i = 0; i < arr.length; i++) {

            if (!isPrime(arr[i])) {
                sumNonPrime += arr[i];
            }
        }

        return sumNonPrime;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(sumOfPrime(arr));
        System.out.println(sumOfNonPrime(arr));

    }

}
