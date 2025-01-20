class LeftMax1{
	public static void main(String[] args){

		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int N=10;
	
		int LeftMax[]=new int[N];

		LeftMax[0]=arr[0];

		for (int i =1;i<arr.length;i++){

			if(LeftMax[i-1]<arr[i]){
				LeftMax[i]= arr[i];

			}else{
				LeftMax[i]=LeftMax[i-1];

			}
		}
		for (int i=0;i<LeftMax.length;i++){

			System.out.print(LeftMax[i]+" ,");
		}
	}
}

