abstract class Abstractexp {
    abstract void sound();


    void sleep()
    {
        System.out.println("this animal is sleeping");
    }
}

    class Animal extends Abstractexp{
        void sound()
        {
        System.out.println("this animal sounding like baw baw");
        }
        public void behavior()
        {
         System.out.println("The behavior of this animal is so different.");
        }
        public void nameani(String name)
        {
            System.out.println("The name of the animal is:"+name);
        }


}
public class AbstractEampMain{
  public static void main(String args[])
  {
    Animal a=new Animal();
    a.sound();
    a.behavior();
    a.nameani("teja");
   }
}
        


 
