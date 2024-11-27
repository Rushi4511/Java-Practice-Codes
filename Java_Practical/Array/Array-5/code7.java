public class code7 {
    public static void main(String[] args) {
        int arr[]={4,3,5,7};
        for(int val:arr){
            if(val==1) {
                continue;
            }
            int f=0;
            for(int i=2;i<=Math.sqrt(val);i++){
                if(val%i==0){
                    f=1;
                    break;

                }
            }
            if(f!=0){
                System.out.print(val+"\t");

            }
        }


    }

}
