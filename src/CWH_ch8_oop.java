// custom class
class Employee{
    int id;
    String name;
    float salary;
 public void printDetails(){
     System.out.println("My Id is : "+ id );
     System.out.println("My name is : " + name );
 }
 public float getSalary(){
     return salary;
 }
}
public class CWH_ch8_oop {
    public static void main(String[] args) {
        System.out.println("this our custom class ");
        Employee harry=new Employee();// Instantiating a new Employee Object.
        Employee john = new Employee();
        // Setting attributes / properties for Harry.
        harry.id=12;
        harry.name="CodeWithHarry";
        harry.salary=3454;

        // Setting attributes / properties for John.
        john.id=15;
        john.name="John khandewal";
        john.salary = 122;

        //Printing the attributes
        harry.printDetails();
        john.printDetails();


        float SalaryHarry=harry.getSalary();
        System.out.println(SalaryHarry);
        //function call
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
