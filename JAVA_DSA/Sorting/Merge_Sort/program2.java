class MergeSort2{

	void mergeSort1(int arr[] ,int start, int end){
		if(start<end){
			int mid = start+(end-start)/2;
			

			mergeSort1(arr,start,mid);
			mergeSort1(arr,mid+1,end);

			System.out.println("Start:"+ start +"Mid:"+ mid +"End:"+end);

		}
	}
	public static void main(String[] args){

		MergeSort2 obj =new MergeSort2();

		int arr[] = new int[]{9,1,8,2,7,3,6,4};
		int start =0;
		int end =arr.length;

		obj.mergeSort1(arr,start,end);

	}
}


