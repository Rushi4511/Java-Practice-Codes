class Program{

	 public static int fun(int num){
		if(num<=0)
			return 2;
		int ans1 =fun(num-1) + fun(num-2);
		
		int ans2 =fun(num-2) + fun(num-1);
		
		
		return ans1 + ans2;
	}
	public static void main(String[] args){

		Program obj = new Program();
		int retObj = fun(2);
		System.out.println(retObj);
	}
}
