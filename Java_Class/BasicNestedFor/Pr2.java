import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
