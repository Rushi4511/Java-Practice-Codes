import java.util.*;


class SpaceBracket{

	public static void main(String[] args){
		

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String nums[] = str.split(" ");
		ArrayList<Integer> list = new ArrayList<>();

		for(String num:nums){
			list.add(Integer.parseInt(num));
		}

		for(int ele:list){
			System.out.print(ele+" ");
		}



	}
}
