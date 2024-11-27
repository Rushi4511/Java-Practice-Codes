import java.util.ArrayList;
import java.util.Scanner;

public class pr3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you String : ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        char arr[]=str.toCharArray();
       ArrayList<Character>a1=new ArrayList<>();
        a1.add('a');
        a1.add('e');
        a1.add('i');
        a1.add('o');
        a1.add('u');
        for(int i=0;i<=arr.length;i++){
            if(a1.contains(arr[i])){
                System.out.println("The vovel "+arr[i]+" present at index : "+i);
            }
            
        }



        

        }
}
