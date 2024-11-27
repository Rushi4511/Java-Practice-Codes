public class code10 {
    public static void main(String[] args) {
      int arr[]={11,13,22,17,45};
      int mul=1;
      for(int i=0;i<arr.length;i++){
        int num=arr[i];
        int f=0;
        if(num<1)
        {
            f=1;
            continue;
        }
        else
        {
            for(int j=2;j<(int)(Math.sqrt(num));j++)
            {
                if(num%j==0)
                {
                    f=1;
                    break;
                    

                }

            }
            if(f==0)
            {
                mul=mul*num;
                
            }


        }
        
      }
      System.out.println("multiplication of prime number is :"+mul);
    }
    
}


