class SecSmAndSecLarg{


	public static int secMinEle(int arr[]){
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(min>arr[i]){

				secMin = min;
				min = arr[i];
			}
		}
		return secMin;
	}
	public static int secMaxEle(int arr[]){
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(max<arr[i]){

				secMax = max;
				max = arr[i];
			}
		}
		return secMax;
	}




	public static void main(String[] args){

		int arr[] = new int[]{4,5,7,6,8,1};

		System.out.println("Second Minimum Element in Array is: "+secMinEle(arr));
		System.out.println("Second Maximum Element in Array is: "+secMaxEle(arr));
	}
}
