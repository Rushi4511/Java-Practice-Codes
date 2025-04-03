package Arrays.PYQ;

public class SortArrayConsistOf_012 {

    public static void sortArray(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0)
                count0++;

            if (arr[i] == 1)
                count1++;

            if (arr[i] == 2)
                count2++;

        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;

        }

        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }

        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

    public static void DNFA_Sort(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        int n = arr.length;

        sortArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        DNFA_Sort(arr, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
