public class code1{
    public  static void main(String ar[]){
        int x=10;
        int y=10;
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        String str1=new String("Aksh");
        String str2=new String("Aksh");
    
        System.out.println("//for String //");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        String str3="abc";
        String str4="abc";
        System.out.println("// for String Literals ");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}