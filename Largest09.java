
import java.util.*;
import java.util.Arrays;
public class Largest09 {
        void function(){
            
            int[] a=new int[5];
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the array elements:");
            for(int i=0;i<a.length;i++)
                {
                    a[i]=s.nextInt();
                }
            System.out.println("The list of integers are:"+Arrays.toString(a));
            int large=a[0];
            for(int i=1;i<a.length;i++){
                if(a[i]>large)
                {
                    large=a[i];
                }
            }
                System.out.println("This is the largest number in the present array:"+large);
         }
    }
    
class MainLarge{
    public static void main(String args[]){
        Largest09 ls=new Largest09();
        ls.function();
    }
}
