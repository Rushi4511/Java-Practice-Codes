import java.util.*;

class Program6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		for(int i=0;i<rows;i++){
			for(int j=cols;j>i;j--){

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
