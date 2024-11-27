abstract class Demo{
	void marry(){
		System.out.println("In parent Marry");
	}

	abstract void career();
	
}

class Child extends Demo{
	void career(){
		System.out.println("In Child Career");
	}
}	

class Client{
	public static void main(String[] args){
		Demo obj =new Child();
		obj.marry();
		obj.career();
	}
}
