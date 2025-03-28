import java.util.*;

class FrequencyUsingHM{

	public static void main(String[] args){

		int arr[] = new int[]{10,5,5,10,15,10};

		int n = arr.length;

		frequency(arr,n);


	}

	public static void frequency(int arr[],int n){

		Map<Integer,Integer> map = new HashMap<>();

		for(int i =0;i<arr.length;i++){

			if(map.containsKey(arr[i])){

				map.put(arr[i],map.get(arr[i])+1);

			}else{
				map.put(arr[i],1);
			}
		}

		for(Map.Entry<Integer,Integer> entry : map.entrySet()){

			System.out.println(entry.getKey() +" : "+entry.getValue() );
		}
	}
}
