public class code3 {
    public static void main(String[] args) {
        int arr[] = {80,70,30,20,10};
        int m1 = 0;
        int m2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m1) {
                m2 = m1;
                m1 = arr[i];
            } else if (arr[i] > m2 && arr[i] != m1) {
                m2 = arr[i];
            }
        }
        System.out.println(m2);
    }
}
