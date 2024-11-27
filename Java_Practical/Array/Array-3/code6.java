public class code6 {
    public static void main(String[] args) {
         char arr[]={'a','b','z','e','x'};
         System.out.println("consonent in arr are : ");
         for(int i=0;i<arr.length;i++){
            char ch2=arr[i];
            if(arr[i]<97)
            {
              ch2=(char)(arr[i]+32);
            }
          

            if(ch2!='a'&& ch2!='e'&& ch2!='i'&& ch2!='o'&& ch2!='u')
            {
                System.out.println(arr[i]);
            }

         }
    }
}
