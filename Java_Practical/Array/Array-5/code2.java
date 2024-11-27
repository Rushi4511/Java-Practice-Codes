public class code2 {
    public static void main(String[] args) {
        int arr[]={11,22,11,23,4,3,2,1};
        int osum=0;
        int esum=0;
        for(int val:arr){
            if(val%2==1){
                osum+=val;
            }
            else
            {
                esum+=val;
            }
        }
        System.out.println("The sum of Even numbers is : "+esum);

        System.out.println("the sum of odd number is : "+osum);
    }

}
