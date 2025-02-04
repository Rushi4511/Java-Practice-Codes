class MergeSort1{

	void mergeSort1(int arr[] ,int start, int end){
		if(start<end){
			int mid = start+(end-start)/2;
			System.out.println("Start:"+ start +"Mid:"+ mid +"End:"+end);

			mergeSort1(arr,start,mid);
			mergeSort1(arr,mid+1,end);
		}
	}
	public static void main(String[] args){

		MergeSort1 obj =new MergeSort1();

		int arr[] = new int[]{9,1,8,2,7,3,6,4};
		int start =0;
		int end =arr.length;

		obj.mergeSort1(arr,start,end);

	}
}


