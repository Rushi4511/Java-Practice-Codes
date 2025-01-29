class DiagonalMatrix{
	public static void main(String[] args){
		
		int[][] arr =new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};

		
		for(int i=0;i<arr.length;i++){
			int count=0;	
			for(int j = i;j<arr[i].length;j++){
				
				while(i<=count){
					System.out.println(arr[i][count] +",");
					count++;
				}
			}
		}

	}
}
