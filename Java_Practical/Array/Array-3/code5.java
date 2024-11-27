public class code5 {
    public static void main(String[] args) {
        int arr[]={11,-3,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            {
                arr[i]=arr[i]*arr[i];
            }
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
    
}
