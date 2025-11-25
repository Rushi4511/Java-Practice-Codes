
public class Tester {
	
	public static int linearSearch(int arr[], int key) {
		//1. traverse array from 0 to N-1 index
		for(int i = 0 ; i < arr.length ; i++) {
			//2. compare key with current element
			if(key == arr[i])
				//3. if key is matching return index of it
				return i;
		}
		//4. if key is not found then return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key) {
		//1. decide left and right of array
		int left = 0, right = arr.length-1,mid;
		//2. search key untill invalid partition
		while(left <= right) {
			//3. find middle element
			mid = (left + right) / 2;
			//4. compare with middle element
			if(key == arr[mid])
				return mid;
			//5. if key is less than middle element
			else if(key < arr[mid])
				right = mid - 1;
			//6. if key is greater than middle element
			else
				left = mid + 1;
		}
		//7. if key is not found return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key, int left, int right) {
		//1. stop if partition is invalid
		if(left > right)
			return -1;
		//2. find middle element of array
		int mid = (left + right)/2;
		//3. compare key with middle element
		if(key == arr[mid])
			return mid;
		//4. if key is less then search it into left
		else if(key < arr[mid])
			return binarySearch(arr, key, left, mid - 1);
		//5. if key is greater then search it into right
		else
			return binarySearch(arr, key, mid + 1, right);
	}

	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55 ,66 , 77, 88, 99};
		
		int ret = binarySearch(arr, 25);
		if(ret == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index " + ret);

	}

}












