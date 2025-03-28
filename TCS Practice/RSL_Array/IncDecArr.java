import java.util.*;

class IncDecArray{

	public static void main(String[] args){

		int arr[] = new int[]{8,7,1,0,6,5,9};
		Arrays.sort(arr);
		int n = arr.length;

		int mid = n/2;

		for(int i =0;i<mid;i++){

			System.out.print(arr[i]+" ");
		}

		for(int i=n-1;i>=mid;i--){

			System.out.print(arr[i]+" ");
		}
	}
}
