import java.util.StringTokenizer;

public class code4 {
    public static void main(String[] args) {
        int arr[]=new int[]{};
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        String str="Akshay Sanjay Raut ";
        StringTokenizer st=new StringTokenizer(str," ");
        System.out.println("total nmuber of tokens are : "+ st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        String []strArr=str.split(" ");
        for(String strr:strArr){
            System.out.println(strr);
        }
    }

    
}
