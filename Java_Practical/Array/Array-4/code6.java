public class code6 {
    public static void main(String[] args) {
        char arr[]={'a','K','S','h','A','y'};
        int countV=0;
        int countC=0;
        for(int i=0;i<arr.length;i++){
            char val=arr[i];
            if(val<96){
               val=(char)(val+32);
            }
            if(val=='a' ||val=='e' ||val=='i' ||val=='o' ||val=='u' ){
                countV++;
            }
            else
            {
                countC++;
            }

            
        }
        System.out.println("the voveles in array are :"+countV+" and consonrt in array are :"+countC);

    }
}
