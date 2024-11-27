public class code4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,5,6,2,8,10};
        int sum=0;
        for(int val:arr){
            if(val%2==1)
            {
                sum+=val;
            }

        }
        System.out.println("The addition if odd elements in array are : "+sum);
        
    }
    
}
