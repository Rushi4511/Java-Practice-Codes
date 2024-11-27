public class code7 {
    public static void main(String[] args) {
        char ch[]={'a','B','C','d','A'};
        for(int i=0;i<ch.length;i++){
            if(ch[i]<96){
                ch[i]=(char)(ch[i]+32);
            }


        }
        for(char val:ch){
            System.out.print(val+"\t");
        }
    }
}
