import java.io.*;
import java.net.*;
import java.io.PrintWriter;
import java.util.Date;


public class SocketExp {
    public static void main(String args[])throws Exception{
        ServerSocket s=new ServerSocket(2000);
        System.out.println("TThis time sever is ready...");
        while(true){
            Socket ss=s.accept();
            PrintWriter ps=new PrintWriter(ss.getOutputStream(),true);
            ps.println(new Date().toString());
            ps.println("hello ");  
        }
   

    }
    
}
