public class code4 {
    public static void main(String[] args) {
        int arr1[]={11,22,33,44,55};
        int arr2[]={34,52,21,453,11,55};
        System.out.println("Common Elements in array is : ");
        for(int i=0;i<arr1.length;i++){
            int val=arr1[i];
            for(int j=0;j<arr2.length;j++){
                if(val==arr2[j]){
                    System.out.print(val+"\t");

                }
            }
        }
    }
}
