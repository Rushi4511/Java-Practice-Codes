package TCSPractice.PYQ;

public class MergeArray {

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 3, 5, 7 };
        int arr2[] = new int[] { 2, 4, 6, 8 };

        int n1 = arr1.length;
        int n2 = arr2.length;

        int arr3[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while ((i < arr1.length) && (j < arr2.length)) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
            } else {
                System.out.print(arr3[i] + ",");
            }
        }

    }

}
