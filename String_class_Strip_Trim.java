public class String_class_Strip_Trim {
    public static void main(String[] args) {
        String ss=new String("java");
        System.out.println(ss.charAt(0));
        System.out.println(ss.substring(2));

        System.out.println(ss.length());

        
    
    String s = "\u2002\u2002Hello World!   "; // "\u2002" is an en space (Unicode)
    String s1 = "   Hello World!   "; // "\u2002" is an en space (Unicode)

System.out.println(s1.trim());  // Output: "??Hello World!" (Unicode not handled)
System.out.println(s.strip());
    }
}
