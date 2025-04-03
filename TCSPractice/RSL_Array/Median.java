import java.util.*;

class Median{
	public static void main(String[] args){

		
		int arr[] = new int[]{2,5,1,7};
		int N = arr.length;
		Arrays.sort(arr);
		int idx1= N/2;
	        int idx2 =  (N/2) -1;
		
		

		double median = 0;
		if(N%2==0){

			median = (double)(arr[idx1]+arr[idx2])/2;	
		}else{
			median = arr[N/2];
		}

		System.out.println(median);
	}
}
