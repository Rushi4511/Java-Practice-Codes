import java.util.*;

class Program4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		for(int i=0;i<rows;i++){
			int num =1;
			for(int j=0;j<=i;j++){

				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}
