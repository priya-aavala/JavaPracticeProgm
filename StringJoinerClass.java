public class StringJoinerClass {
    public static void main(String args[])throws Exception{
        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("java");
        sj.add("html");
       System.out.println(sj);

   }
    
}
