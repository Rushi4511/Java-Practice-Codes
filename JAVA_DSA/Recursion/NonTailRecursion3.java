class Program{

	 public static int fun(int num){
		if(num<=0)
			return 1;
		int ans1 =num + fun(num-1);
		System.out.println(ans1);
		int ans2 =num + fun(num-2);
		System.out.println(ans2);
		
		return ans1 + ans2;
	}
	public static void main(String[] args){

		Program obj = new Program();
		int retObj = fun(2);
		System.out.println(retObj);
	}
}
