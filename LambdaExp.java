@FunctionalInterface
interface A{
    void show(int i,int j);
}
public class LambdaExp {
    public static void main(String a[]){
        A obj=(i,j)->System.out.println("this is show :" +i +","+j); /*This is the lambda expression without writtening the method again, 
        I compiler can easily identifies the method so we don't need to write the  method again .
        //Here actually A obj= new A; this line means we are creating the instance of the interface but A obj=new A
         without semiclone this means we are not creatiing a instance 
        here The class implements the interface and that too it continous the statment .*/
            obj.show(8,9);
        }
   
   

    }
    

