class SelectionSort1{

	public static void selectionSort(int arr[],int i){
			
		if(i==arr.length)
				return;
		
		int minIndex =i;
		int j=i+1;
		while(j<arr.length){
			if(arr[j]<arr[minIndex])
				minIndex =j;

			j++;
		}
		int temp =arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;

		selectionSort(arr,i+1);	
	

	}
	public static void main(String[] args){

		int arr[] = new int[]{9,2,7,3,8,4,1,6};
		int i=0;
		selectionSort(arr,i);


		for( i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");
		}
	}
}
