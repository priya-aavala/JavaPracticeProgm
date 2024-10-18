
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String args[]){
        int[] arr=new int[5];
        System.out.println("Enter the array elements:");
        Scanner s=new Scanner(System.in);
        for(int i =0;i<arr.length;i++){

            
            arr[i]=s.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);

        }
        

    

    }
    
}
