class Outer{

	Outer(){

		System.out.println("Outer Const");
	}

	void fun(){

		class Inner1{

			Inner1(){
				System.out.println("Innner1 const");
			}

		}
		class Inner2{
			Inner2(){
				System.out.println("Inner2 Const");
			}
		}
	}
	public static void main(String[] args){

		Outer obj =new Outer();
		obj.fun();
	}
}
