public class SecondSmallest {

    public static int secSmallest(int arr[]) {

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        if(arr.length <=1){
            System.out.println("No Second Largest Element");
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < small) {
                secSmall = small;
                small = arr[i];
            } else if (arr[i] < secSmall && arr[i] != small) {
                secSmall = arr[i];
            }

        }
        

        return secSmall;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(secSmallest(arr));
    }

}
