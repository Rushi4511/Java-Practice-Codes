import java.util.*;


class WithDynamicArray{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0;i<N;i++){
			list.add(sc.nextInt());
		}


		for(int i=0;i<N;i++){

			System.out.print(list.get(i)+" ");
		}


		System.out.println();
		for(int ele:list){
			System.out.print(ele+" ");
		}
	}
}
