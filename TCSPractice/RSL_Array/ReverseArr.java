class Reverse{

	public static void main(String[] args){

		int arr[] = new int[]{1,4,5,6,7,8};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();

		int start = 0;
		int end = arr.length-1;
		while(start<end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}


		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}

