
import java.util.ArrayList;
import java.util.List;

public class DupEleWithoutSet {

    public static int[] findDuplicates(int[] arr) {

        List<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    if (!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]);
                    }
                    break;
                }
            }
        }
        int[] result = new int[duplicates.size()];

        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 2, 5, 4, 5, 6 };

        int[] result = findDuplicates(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
