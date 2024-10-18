
import java.io.*;
import static java.lang.System.*;
public class ByteInputStream {
    public static void main(String args[]) throws Exception{
        FileInputStream fs=new FileInputStream("priya.txt");

        FileOutputStream fs1=new FileOutputStream("greetings.txt");
        int r;
        while((r=fs.read())!=-1){
            System.out.println((char)r);
            fs1.write(r);

        }
        fs.close();
        fs1.close();
        System.out.println("The priya.txt file content is sucessfully copyed and pasted into the file greetings");
        

    }
    
}
