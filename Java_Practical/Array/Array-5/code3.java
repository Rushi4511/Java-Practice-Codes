public class code3 {
    public static void main(String[] args) {
        int arr[]={1,4,1,1,2,1};
        int s=0;
        int l=arr.length-1;
        int f=0;
        while(s<l)
        {
            if(arr[s]!=arr[l])
            {
                f=1;
                break;
            }
            s++;
            l--;
        }
       if(f==0)
       {
           System.out.println("Array is palindrome ! ");
       }
       else
       {
           System.out.println("array is not a palindrome ! ");
       }
    }
}
