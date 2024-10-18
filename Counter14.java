public class Counter14 {
    int count;
    public Counter14(){
       this.count=0;
    }
    public Counter14(int initailvalue){
        this.count=initailvalue;

    }
    public void increament(){
        count+=1;
    }
    
    public void decreament(){
        count-=1;
    }
    int display(){
        return count;
    }

    public static void main(String args[]){
        Counter14 c=new Counter14();
        c.increament();
        System.out.println("The value after increament:"+c.display());
        Counter14 c1=new Counter14(7);
       c1.decreament();
       System.out.println("After the value is decrement"+c1.display());
        c.display();
        c1.display();

    }
}
