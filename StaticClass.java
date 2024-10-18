public class StaticClass {
    static public class Staticclass1{
        public void normalMethod()
        {
         System.out.println("This is static class and inside this method");
         }   
    }
    public void normalMethod1(){
        System.out.println("This is normal method");
    }
    public static void main(String argd[]){
    StaticClass.Staticclass1 SS=new StaticClass.Staticclass1();
    SS.normalMethod();
    StaticClass sss=new StaticClass();
    sss.normalMethod1();

}}
