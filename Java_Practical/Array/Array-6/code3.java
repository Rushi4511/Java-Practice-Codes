import java.util.*;
public class code3 {
    public static void main(String[] args) {
        int arr[] = { 1, 22, 34, 1, 2, 45, 8, 4, 8 };
        System.out.println("array looks like :");
    
        for(int val:arr){
            System.out.print(val+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int val=arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                   
                }

            }
           
            if (count > 2) { // Should check count > 2, not count > 3
                for (int k = 0; k < arr.length; k++) {
                    if (val == arr[k]) {
                        arr[k] = (int) Math.pow(arr[k], 3);
                    }
                }
            }
        }
        System.out.println("New array looks like :");
        for(int val:arr){
            System.out.print(val+"\t");
        }
    }
}
