// Using Euclidean Algorithm


class OptimizeGCD{
	public static int GcdNum(int a,int b){

		while(a>0 && b>0){

			if(a>b)
				a=a%b;
			else
				b =b%a;

		}
		if(a==0){
			return b;
		}

		return a;
	}
	
	public static void main(String[] args){

		int num1 =15;
		int num2 =20;

		int gcd = GcdNum(num1,num2);

		System.out.println(gcd);
	}
}
