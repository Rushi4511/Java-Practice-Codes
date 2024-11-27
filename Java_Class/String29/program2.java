class StringDemo1{
	public static void main(String[] args){
		String str = new String("Shashi");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
                
     
                
		str =str +"Bagal";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
     
				
		
		str =str +"C2W";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}
}
     
