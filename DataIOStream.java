import java.io.*;
import java.lang.*;

public class DataIOStream {
    public static void main(String args[])throws Exception {
        FileInputStream fis=new FileInputStream("priya.txt");
        DataInputStream dis=new DataInputStream(fis);
        String line;
        while((line=dis.readLine())!=null){
            System.out.println(line);

        }
        fis.close();
        dis.close();
    }
    
}
