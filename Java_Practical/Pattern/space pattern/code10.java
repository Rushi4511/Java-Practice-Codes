import java.util.Scanner;

public class code10 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows : ");
            int row=sc.nextInt();
            for(int i=1;i<=row;i++){
                int val=65;
                for(int j=1;j<=row;j++){
                    if(j<i){
                        System.out.print("\t");
                    }
                    else
                    {
                       if(row%2==0)
                       {
                        if(j%2==1){
                            System.out.print(val+"\t");
                            
                        }
                        else
                        {
                            System.out.print((char)val+"\t");
                        }
                       }
                       else
                       {
                        if(j%2==0){
                            System.out.print(val+"\t");
                            
                        }
                        else
                        {
                            System.out.print((char)val+"\t");
                        }
                       }

                        
                    }
                    val++;
                }
                System.out.println();
            }
            
        }    
}
