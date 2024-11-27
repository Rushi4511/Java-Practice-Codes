public class Code1 {
    public static void main(String ar[]){
        System.out.println("Hello world ! ");
        int arr[]={55,33,45,53,61,67};
        int f=0;
        if(arr[0]>arr[1]){
            f=1;
            System.out.println("not a sorted array ! ");
            return;


        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                f=1;
                break;

            }


        }
        if(f==0)
        {
            System.out.println("Array is sorted ! ");
        }
        else
        {
            System.out.println("Array is not sorted ! ");
        }
    }


}
