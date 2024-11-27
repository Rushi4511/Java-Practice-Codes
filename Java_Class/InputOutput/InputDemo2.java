class InputDemo2{
	void methodFun(){
		System.out.println("In method fun");
	}
	void methodGun(){
		System.out.println("In method Gun");
	}
	void methodRun(){
		System.out.println("In method run");
	}
	public static void main(String []args){
		System.out.println("In main method");
		InputDemo2 obj=new InputDemo2();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}
}
