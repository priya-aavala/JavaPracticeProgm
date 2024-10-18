
import java.io.*;
import java.lang.*;

public class SerializationAndDesrialExp implements Serializable {

    int eno;
    String ename;
    double salary;
    SerializationAndDesrialExp(int eno,String ename,double salary){
        this.eno=eno;
        this.ename=ename;
        this.salary=salary;
    }
    void print(){
        System.out.println("The employee details:");
        System.out.println("The emoloyee en.o:"+eno);
        System.out.println("The employee name"+ename);
        System.out.println("The employee salary:"+salary);

    }
}

class Serail{
    public static void main(String args[]) throws Exception{
        FileOutputStream fos=new FileOutputStream("nadh.txt");//it create a path of the file and FileOutputStream opens the file for writing in byte form.
        ObjectOutputStream oos=new ObjectOutputStream(fos);//ObjectOutputStream allows writing objects to the file by converting them into a byte stream. Without ObjectOutputStream, you could not write objects, only raw data.

        SerializationAndDesrialExp s=new SerializationAndDesrialExp(1,"priya",5000000);
        oos.writeObject(s); //while writing objects by using writeObject() method is called serialization .
          fos.close();
          oos.close();
          FileInputStream fis=new FileInputStream("nadh.txt");//FileInputStream opens the file and reads its byte stream.
          ObjectInputStream ois=new ObjectInputStream(fis);//ObjectInputStream interprets the byte stream as a serialized Java object and converts it back into an object in memory.
          SerializationAndDesrialExp s2=(SerializationAndDesrialExp)ois.readObject(); //while writing object by using readObject() method is called deserialization.
           s2.print();
           fis.close();
           ois.close();
    }

}
