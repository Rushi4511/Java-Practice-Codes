public class code4 {
    public static void main(String[] args) {
        int arr[]={11,22,12,45,56};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    
}
