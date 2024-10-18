
@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class LambdaExpReturn {
    public static void main(String args[]){
        A obj=(int i, int j)-> {
            if(i>j)
            System.out.println("equal"+i);
            return i;
            
        };
        System.out.println(obj.add(3,4));
         System.out.println(obj.add(4,4));
    }
    
}

