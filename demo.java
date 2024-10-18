import java.util.*;
public class demo  {
    public static void main(String args[]){
        ArrayList<Integer> c=new ArrayList<Integer>();
        c.add(1);
        c.add(20);
        c.add(10);
        c.add(1);
     System.out.println("The index value is"+c.get(2));  //BY using the Arraylist and list we can access the index ...
     System.out.println("This is the value of the of the index:"+ c.indexOf(20));
     
     for(int num:c){
            System.out.println(num);

        }  //we can print the list of elements
    
        Set<Integer> c1=new HashSet<Integer>();
        c1.add(1);
        c1.add(20);
        c1.add(10);
        c1.add(1);
        System.out.println("this is set elements which doesn't allows the duplicate elements:"+c1);
    
}
}