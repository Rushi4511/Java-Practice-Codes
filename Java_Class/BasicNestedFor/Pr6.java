import java.util.*;
class Demo{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row count: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch='A';
			for(int j=1;j<=row;j++){
				System.out.print(j+""+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
