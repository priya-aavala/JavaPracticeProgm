 class SynchronizedThread extends Thread{
    synchronized public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread 1:"+i);

        }
    }
}
public class SyncThreadExp{
    public static void main(String args[]){
        SynchronizedThread ss=new SynchronizedThread();
        SynchronizedThread ss2=new SynchronizedThread();
        ss.start();
        
        ss2.start();
       String name=ss.getName();
}

}



