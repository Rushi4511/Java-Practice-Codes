package PYQ;

import java.util.PriorityQueue;

public class KthLargest {

    public static int kLargest(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);

            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int k = 1;

        System.out.println(kLargest(arr, k));
    }

}
