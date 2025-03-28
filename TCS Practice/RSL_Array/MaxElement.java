import java.util.*;

class MaxElement{
	public static void main(String[] args){

		int arr[] = new int[]{6,5,4,6,4,8,1};

		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++){

			if(max<arr[i]){

				max = arr[i];
			}
		}
		System.out.println(max);
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
