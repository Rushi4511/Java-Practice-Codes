import java.util.*;

class Program7{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		
		for(int i=0;i<rows;i++){
			int count=1;
			for(int j=cols;j>i;j--){

				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}
