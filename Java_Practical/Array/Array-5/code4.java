public class code4 {
    public static void main(String[] args) {
        int arr[]={11,22,33,22,44,11,45};
        int f=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;

                }
                if(count==2)
                {
                    System.out.println("the index of first duplicate elemnt is "+i);
                    f=1;
                    break;

                }
            }
            if(count==2){
                break;
            }
        }
        if(f==0){
            System.out.println("There is no duplicate element in array ! ");
        }
    }
}
