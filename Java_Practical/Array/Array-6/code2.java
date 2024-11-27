public class code2 {
    public static void main(String[] args) {
       int arr[]={2,22,3,5,45,7};
       int count=0;
       int sum=0;
       for(int val:arr){
        if(val<2){
            continue;
        }
        int f=0;
        for(int i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i==0)
            {
                f=1;
                break;
            }

        }
        if(f==0)
        {
            sum+=val;
            count++;
        }
       }
       System.out.println("total number of prime numbers in array are : "+count+" and the sum is :"+sum);
    }
}
