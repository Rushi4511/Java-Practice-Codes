public class code22 {
    public static void main(String[] args) {
        int arr[]={11,22,33,2,3,4,54,33};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Diffrence is "+(max-min));
    }
}
