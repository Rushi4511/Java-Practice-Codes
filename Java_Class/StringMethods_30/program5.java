class CompareTo1{
	public static void main(String[] args){
		String str1 ="Ashish";
		String str2 ="Ashish";

		System.out.println(str1.compareTo(str2));

		String str3 ="Ashish";
		String str4 ="Ashira";

		System.out.println(str3.compareTo(str4));
		str4 = "ashish";
		System.out.println(str3.compareTo(str4));
	}
}

