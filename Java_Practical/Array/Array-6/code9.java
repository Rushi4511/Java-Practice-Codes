public class code9 {
    public static void main(String[] args) {
        int arr[]={121,454,232,1234,1};
        System.out.println("Palindrome numbers in array are : ");
        for(int val:arr){
            int temp=val;
            int rev=0;
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
                
            }
            if(val==rev){
                System.out.print(val+"\t");
            }
        }
    }
}
