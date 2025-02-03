import java.util.*;

class BinarySearch{

	int binarySearch(int[] arr,int search, int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)/2;

		if(arr[mid]==search){
			return mid;

		}else if (arr[mid]>search){
			end = mid-1;
			return binarySearch(arr,search,start,end);
		}else{
			start=mid+1;
			return binarySearch(arr,search,start,end);
		}
	}
	public static void main(String[] args){
	
		Scanner sc =new Scanner(System.in);
		BinarySearch obj = new BinarySearch();	
		
		System.out.println("Enter the size of Array:");	
		int N=sc.nextInt();

		int arr[] = new int[N];
	
		System.out.println("Enter the elements in Array:");	
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}

		
		System.out.println("Enter the Element to be Searched:");	
		int search =sc.nextInt();

		int start = 0;
		int end = arr.length-1;

		int index = obj.binarySearch(arr,search,start,end);
		System.out.println("Element is at Index: "+index);
	}
}
