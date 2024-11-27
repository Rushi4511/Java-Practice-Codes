import java.util.Arrays;

public class code2 {
    public static void main(String[] args) {
        int arr[]={11,1,43,100,13,4,53,3};
        Arrays.sort(arr);

        System.out.println("Diffrence between maximum and minmum element in aaray : "+(arr[arr.length-1]-arr[0]));

    }
}
