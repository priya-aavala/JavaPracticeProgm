public class UserDefinedExp extends Exception {
    public static void main(String[] args) throws Exception {
        int age=10;
       try{

      
        if(age<18)
        {
         throw new Exception("Your age is not valid for voting");
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    System.out.println("Executed successfully"); 
    }
    
}
