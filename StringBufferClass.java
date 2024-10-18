public class StringBufferClass {
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("java");
        s.append("EE");
        System.out.println(s);
        s.insert(0,"oracel");
        System.out.println(s);

        s.delete(2,5);
        System.out.println(s);
        
    }

    
}
