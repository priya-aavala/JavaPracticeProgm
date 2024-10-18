public class Student15 {
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fee_paid;
    //constant for the fees of courses

    private static final double java_fee=10000.0;
    private static final double python_fee=7500.0;
    public Student15(int admin_no,String stu_name,String course_joined,double fee_paid){

        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=(course_joined.equalsIgnoreCase("python"))?"python":"java";
        this.fee_paid=fee_paid;

    }
    public double getTotalFee(){
        if(course_joined.equalsIgnoreCase("java")){
            return java_fee;
         }
         else if(course_joined.equalsIgnoreCase("python"));{
            return python_fee;
         }
   
}
public double getDue(){
    return getTotalFee()-fee_paid;
}
public double getFreePaid(){
    return fee_paid;
}
public void payment(double amount){
    if (amount>0 &&fee_paid+amount<=getTotalFee()){
        fee_paid+=amount;
        System.out.println("payment of"+amount +"accepted. total fee paid:"+fee_paid);
    }else{
        System.out.println("invalid payment amount.please check the due balance");

      }
    }
public void displayStudentInfo(){
    System.out.println("student name"+stu_name);
    System.out.println("student name"+admin_no);
    System.out.println("student name"+course_joined);
    System.out.println("student name"+getTotalFee());
    System.out.println("student name"+getFreePaid());
    System.out.println("student name"+getDue());
    
}
public static void main(String args[]){
    Student15 student1=new Student15(101,"priya", "java",3000);
    student1.displayStudentInfo();
    student1.payment(2000);
    student1.displayStudentInfo();
    Student15 student2=new Student15(102,"rabbit", "python",5000);
    student2.displayStudentInfo();
    student2.payment(2000);
    student2.displayStudentInfo();
}

}
