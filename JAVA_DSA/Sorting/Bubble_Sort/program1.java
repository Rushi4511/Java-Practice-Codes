class BubbleSort1{

		int count=0;

		void bubble(int arr[],int N){

			if(N==1)
				return;
			boolean swapped=  false;
			int i=0;
			while(i<N-1){
				count++;
				if(arr[i]>arr[i+1]){
					int temp =arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

					swapped = true;
				}
				i++;
				
			}
			if(swapped ==false)
				return;
			bubble(arr, N-1);
		}
		public static void main(String[] args){

			
			BubbleSort1 obj = new BubbleSort1();
			//int arr[] = new int[]{7,3,9,4,2,5,6};
			int arr[] = new int[]{2,3,4,5,6,9,7};
			int N =arr.length;
			int count =0;

			obj.bubble(arr,N);
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+",");
			
			}
			System.out.println();
			System.out.println(obj.count);
		}
}

