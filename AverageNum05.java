import java.util.*;

public class AverageNum05 {
    public static void main(String args[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("enter the" + " " + i +" "+"number");
            int ss=s.nextInt();
            sum+=ss;
        }
        
        double avg=sum/5;

        System.out.println(avg);


    }
    

}