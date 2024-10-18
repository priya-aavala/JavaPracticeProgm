interface Animal {  //this is a interface class
    public void sound();
    public void sleep();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("This animal is doing the sound like the dog");
    }
    public void sleep(){
        System.out.println("this animal is sleep.So don't disturb this animal");
    }
}

class Main{
    public  static void main(String args[]){
        Dog pp=new Dog();
        pp.sound();
        pp.sleep();
    }
}

