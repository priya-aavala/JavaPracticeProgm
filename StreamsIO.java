

import java.io.*;
public class StreamsIO {
    public static void main(String args[])throws Exception{
        File f=new File("priya.txt");//File is a class which is there in io package ,It mainly creates the path only lie the "priya.txt".It doesn't create the file.
        f.createNewFile(); //this method creates the file . This method is  also a inbuilt method.
        System.out.println("The priya file is created");
    }
    
}
