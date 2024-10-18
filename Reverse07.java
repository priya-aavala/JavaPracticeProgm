import java.util.Scanner;

public class Reverse07 {
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        int number=ss.nextInt();
        int reverse=0;
        while(number!=0)
        {
            int lastdigit= number%10;
            reverse=reverse*10+lastdigit;
            number=number/10;

          
        }
     
         System.out.println("This is the reverse of the given number:"+reverse);


    }
    
}
