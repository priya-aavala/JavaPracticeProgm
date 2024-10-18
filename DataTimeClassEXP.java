
import java.text.*;
import java.util.Date;

public class DataTimeClassEXP {
    public static void main(String args[]){
        Date d=new Date();
        DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL);
        System.out.println(df.format(d));
        DateFormat tf=DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(tf.format(d));
        SimpleDateFormat sdf=new SimpleDateFormat("d-MMM-yy HH:mm:ss");
        System.out.println(sdf.format(d));


    }
    
}
