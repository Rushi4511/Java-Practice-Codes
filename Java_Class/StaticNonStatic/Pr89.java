class InputDemo{
	void methodFun(){
		System.out.println("In fun function");
	}
	void methodGun(){
		System.out.println("In gun function");
	}
	void methodRun(){
		System.out.println("In run function");
	}
	public static void main(String []args){
		System.out.println("In main function");
		InputDemo obj=new InputDemo();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}
}
