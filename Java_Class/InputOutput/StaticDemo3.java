class StaticDemo3{
	int x=30;
	static int y=40;
	void fun(){
		System.out.println("In fun");
	}
	static void run(){
		System.out.println("In run method");
	}
	public static void main(String []args){	
		StaticDemo3 obj=new StaticDemo3();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	
	}
}
