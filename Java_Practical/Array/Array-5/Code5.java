public class Code5 {
    public static void main(String[] args) {
        int arr[]={1,34,456,78,5442};
        for(int val:arr){
            int count=0;
            while(val>0){
                count++;
                val/=10;

            }
            System.out.print(count+"\t");
        }

    }
}

