class StringBufferDemo3{
	public static void main(String[] args){
		StringBuffer sb =new StringBuffer("Shashi");

		System.out.println(sb);

		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb.capacity());
		
		sb = sb.append("Bagal");
		
		System.out.println(sb);

		System.out.println(System.identityHashCode(sb));
		
		System.out.println(sb.capacity());
	

	}
}

