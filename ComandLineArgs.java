public class ComandLineArgs {
    public static void main(String[] args){
        int defaultlength=10;
        if(args.length<0){
            System.out.println("usage:java commandlineExample <num>[length]");
            return;
        }
        int num=Integer.parseInt(args[0]);
        int length=(args.length>=2)?Integer.parseInt(args[1]):defaultlength ;

System.out.println("Number (num):"+num);
System.out.println("length:"+length);
    }
    
}
