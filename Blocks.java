public class Blocks {
    static
    {
      System.out.println("This is the static block.");

    }
    public Blocks()
    {
      System.out.println("This is a constructoe.");
    }
    {
        System.out.println("This is the instance method.");
    }


    public static void main(String args[]){
        Blocks b=new Blocks();
    }
    
}

