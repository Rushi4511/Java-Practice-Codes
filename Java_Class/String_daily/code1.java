public class code1{
    public static void main(String[] args) {
        System.out.println("hello world ! ");
        String str1="Akshay";
        String str2="Akshay";
        String str3=new String("Akshay");
        String str4=new String("Akshay");
        System.out.println(str1==str2);
        System.out.println(str3==str1);
        System.out.println(str3==str4);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        // 
        char ch[]=new char[]{'A','K','S','H','A','Y'};
        System.out.println(ch);
        // String builder in java 

       // string are immutable in java 
       String str6="abcd";
       System.out.println("The adress of str6 befor uppercase : "+System.identityHashCode(str6));
       str6=str6.toUpperCase();
       String str7=str6.toUpperCase();
       System.out.println("The adress of str6 befor uppercase : "+System.identityHashCode(str6));
       System.out.println("The adress of str6 befor uppercase : "+System.identityHashCode(str7));

       // StringBuilder 
       System.out.println("StringBuider ! ");
       StringBuilder sb1=new StringBuilder("Akshay");
       StringBuilder sb2=new StringBuilder("Akshay");
       System.out.println(sb1==sb2);
       System.out.println("adrress befor append ");
       System.out.println(System.identityHashCode(sb1));
       sb1.append("Raut");
       System.out.println("adress after append ! ");
       System.out.println(sb1);
       System.out.println(System.identityHashCode(sb1));
       // methods of String 
       



      

       


        


    }
}