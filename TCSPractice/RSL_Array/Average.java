class Average{

	public static void main(String[] args){

		int arr[] = new int[]{1,2,3,4,5,6};

		int N= arr.length;

		int sum =0;

		for(int i =0;i<N;i++){

			sum = sum + arr[i];

		}

		double average = sum / N;

		System.out.println(average);
	}
}
