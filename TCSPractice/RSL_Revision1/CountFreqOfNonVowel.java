import java.util.*;

class CountFreqOfNonVowel {

	public static void countFreq(String input) {
		input = input.toLowerCase();
		StringBuilder inputBuilder = new StringBuilder(input);
		String vowel = "aeiou";

		HashMap<Character, Integer> freqMap = new LinkedHashMap<>();
		int vowelCount = 0;

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				if (vowel.indexOf(c) != -1) {
					vowelCount++;
				} else {
					freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
				}
			}
		}

		for (HashMap.Entry<Character, Integer> entry : freqMap.entrySet()) {

			System.out.print(entry.getKey() + "=" + entry.getValue() + ",");

		}
		System.out.println("Vowels = " + vowelCount);

		for (int i = 0; i < inputBuilder.length(); i++) {
			char ch = inputBuilder.charAt(i);
			if (Character.isLetter(ch) && vowel.indexOf(ch) == -1 && freqMap.containsKey(ch)) {
				System.out.print(ch + "=" + freqMap.get(ch) + ", ");
				inputBuilder.setCharAt(i, ' '); // mark as printed
			}
		}

		System.out.println("Vowels = " + vowelCount);
	}

	public static void main(String[] args) {

		String input = "RajaSoft";
		countFreq(input);
		String input1 = "Buffet";
		countFreq(input1);
		
	}
}
