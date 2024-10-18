
import java.util.*;
import java.util.ArrayList;

public class ArrayList28  {
    String product;
    double price;

public ArrayList28(String product,double price) {  
        this.product = product;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Prog [product=" + product + ", price=" + price + "]";
    }
   public static void main(String[] args){
        List<ArrayList28> prog = new ArrayList<>();
        prog.add(new ArrayList28("Soap",50.50));
        prog.add(new ArrayList28("Brush",40.00));
        prog.add(new ArrayList28("Perfume",140.00));
        prog.add(new ArrayList28("Biscuits",70.00));
        prog.add(new ArrayList28("Powder",80.00));
        prog.add(new ArrayList28("Chocolates",100.00));
        prog.sort((ArrayList28 p1,ArrayList28 p2)->Double.compare(p1.price,p2.price));
        System.out.println("Sorted by price:");
        for (ArrayList28 item : prog) {
            System.out.println(item);  
        }
    }
}