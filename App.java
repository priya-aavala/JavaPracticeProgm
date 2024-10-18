public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int month=6;
        int days=switch(month){
            case 1 ->5;
            case 2,3,4,5,6->20;
            default ->10;
        };
        System.out.println(days);

    }
}
