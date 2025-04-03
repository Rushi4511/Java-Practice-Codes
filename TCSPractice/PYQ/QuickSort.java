package TCSPractice.PYQ;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {

            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end - 1; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 9, 7, 6, 3, 4, 8, 5 };

        int start = 0;
        int end = arr.length - 1;

        quickSort(arr, start, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
