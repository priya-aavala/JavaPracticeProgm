
import java.util.Scanner;
public class Factor06 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int ss=s.nextInt();
        int largerFactor=1;
        int secondLargerNumber=1;
        for(int i=1;i<=ss;i++){
            if (ss%i==0){
                secondLargerNumber=largerFactor;
                largerFactor=i;

            }

        }

        System.out.println("this is the factor of the given name:"+secondLargerNumber);
        s.close();
                
    }
    
}
