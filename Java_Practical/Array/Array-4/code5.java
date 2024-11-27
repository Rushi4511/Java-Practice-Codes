public class code5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,32,3,2};
        int s=0;
        int l=arr.length-1;
        while(s<l){
            int temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;

        }
        for(int val:arr){
            System.out.print(val+"\t");
        }
    }
}
