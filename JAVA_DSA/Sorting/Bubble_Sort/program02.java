class BubbleSort02{
	public static void main(String[] args){

		//int arr[] = new int[]{7,3,9,4,2,5,6};
		int arr[]= new int[]{2,3,4,5,6,7,8};
		int count=0;
		boolean swapped;
		for(int i=0;i<arr.length;i++){

			swapped= false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swapped =true;
					
				}
				count++;
			}

			if(swapped ==false){
				break;
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}

		System.out.println();
		System.out.println(count);
	}
}


