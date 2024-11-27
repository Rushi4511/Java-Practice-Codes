public class code10 {
    public static void main(String[] args) {
        int m1=0;
        int m2=0;
        int m3=0;
        int arr[]={x330,220,110,44,55,66};
        for(int val:arr){
            if(val>m1){
                m3=m2;
                m2=m1;
                m1=val;


            }else if(val>m2 && val!=m1){
                m3=m2;
                m2=val;
            }
            else if(val>m3 && val!=m2){
                m3=val;
            }

        }
        System.out.println(m3);
    }
}
