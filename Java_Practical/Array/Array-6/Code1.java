public class Code1{
    public static void main(String ar[]){

        int arr[]={11,10,9,8,6,5};
        if(arr[0]<arr[1]){
            System.out.println( "The array is not sorted");
        }
        int f=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            {
                System.out.println("The array is not sorted !");
                f=1;
                break;
            }

        }
        if(f==0){
            System.out.println("The array is sorted ! ");
        }

       
    }
}