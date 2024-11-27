class ForSwitchDemo{
	public static void main(String []args){
		int i=0;
		for(;;i++){
			switch(i){
				case i:
					System.out.println("new");
				default:
					System.out.println();
			}
			if(i==10){
				break;
			}
		}
	}
}
