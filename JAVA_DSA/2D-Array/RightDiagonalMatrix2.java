class RightDiagonalMatrix2{
	public static void main(String[] args){
		int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int i =0;
		int j =3;

		
		while(i<3 && j>0){
			System.out.println(arr[i][j]+",");
			i++;
			j--;

		}
	}
}
