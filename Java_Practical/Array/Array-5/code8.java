public class code8 {
    public static void main(String[] args) {
        int arr[]={1,56,877,3,1};
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int val:arr){
            if(val<m1){
                m2=m1;
                m1=val;

            }else if(val<m2 && val!=m1){
                m2=val;
            }
        }
        System.out.println(m2);
    }
}
