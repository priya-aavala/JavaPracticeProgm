

//import static java.lang.System.*;
     class Threads2 extends Thread{
        public void run(){
            for(int i=1;i<10;i++){
                System.out.println(i);
            }
        }
    
    public static void main(String args[]){
        Threads2 ts=new Threads2();
        Threads2 ts2=new Threads2();
        ts.start();
        ts2.start();
        //ts2.stop();  
    }
    
}
