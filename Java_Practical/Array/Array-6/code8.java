public class code8 {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d','e'};
        System.out.println("Array before modification:");
        for(int i=0;i<arr.length;i+=2)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
        int s=0;
        int l=arr.length-1;
        while(s<l){
            char temp=arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }
        System.out.println("Array after reverse ! ");
        for(int i=0;i<arr.length;i+=2)
        {
            System.out.print(arr[i]);
        }
        
    }
}
