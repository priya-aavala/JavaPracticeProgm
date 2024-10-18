public class ProductOpps12 {

    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;
    public ProductOpps12(int prod_id,String prod_name,double price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        this.quantity_on_hand=0;
    }
    public double getNetPrice(){
        return price+(price*0.12);
    }
    public void purchase(int quantity){
        if(quantity>0){
            quantity_on_hand+=quantity;
            System.out.println(quantity+""+ "units of"+" "+prod_name+ "" +"sold");
        }
        else{
            System.out.println("invalid quantity for sale or insufficient stock");
        }
    }
    public void sell(int quantity){
      if(quantity>0 &&  quantity<=quantity_on_hand){
        quantity_on_hand-=quantity;
        System.out.println(quantity+"unit of"+prod_name+"sold");
      }
      else{
        System.out.println("invalid quantity for sale or insufficient stock.");
      }
    }
public void displayProductDetails(){
    System.out.println("Product Id:"+prod_id);
    System.out.println("product name: "+prod_name);
    System.out.println("price :RS "+price);
    System.out.println("Quantity on hand: "+quantity_on_hand);
    System.out.println("net price (with 12%):RS "+getNetPrice());
}
public static void main(String args[]){
ProductOpps12 po=new ProductOpps12(101, "laptop", 5000000);
po.displayProductDetails();
po.purchase(10);
po.sell(3);
po.displayProductDetails();
}

    
}
