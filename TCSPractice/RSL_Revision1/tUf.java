import java.util.*;


class NonRepEle{

	public static char firstNonRepEle(String input){

		HashMap<Character ,Integer> freqMap = new LinkedHashMap<>();

		for(int i =0;i<input.length();i++){
			char ch = input.charAt(i);

			freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);

		}


		for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){

			if(entry.getValue()==1){

				return entry.getKey();
			}
		}

                return ' ';
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println(firstNonRepEle(input));

	}
}


