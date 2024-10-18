abstract class AbstractExpAnimal {
    public abstract void  Animal();
    public void sleep(){
        System.out.println("this animal is sleeping don't disturb this fellow animal");
    }
}
class Pig1 extends AbstractExpAnimal{
    public void Animal(){
        System.out.println("this animal sounding like the dog");

    }

    public static void main(String args[]){
        Pig1 p=new Pig1();
        p.Animal();
        p.sleep();

    }
      



}
