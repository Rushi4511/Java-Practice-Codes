import java.util.*;

class MinElement{
	public static void main(String[] args){

		int arr[] = new int[]{6,5,4,6,4,8,1};

		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++){

			if(min>arr[i]){

				min = arr[i];
			}
		}
		System.out.println(min);
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
