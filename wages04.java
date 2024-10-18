import java.util.*;
public class wages04 {
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the day of the week 1-7 days");
        int dayOfWeek=ss.nextInt();
        System.out.println("enter the number os hours worked");
        int hoursworked=ss.nextInt();
        int wageperhour=switch(dayOfWeek){
            case 1,2,3->200;
            case 4,5->400;
            case 6->600;
            case 7->800;
            default->{
                System.out.println("invalid day of week! please enter the valid day");
                yield 0;
            }

        };
        double totalWages=wageperhour*hoursworked;
        if(totalWages>2000){
            totalWages+=totalWages*0.10;
            System.out.println("print the total wages:"+totalWages);
        }
        ss.close();


    }
    
}
