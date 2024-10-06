//Overload the Employee Constructor to initialize the salary to RS 10000.

class EmployeeSalary{
   private int salary;
   private String name;

   public EmployeeSalary(){  //Constructor Created
       salary=10000;
   }
    public EmployeeSalary(String EmpName){
        salary=10000;
        name=EmpName;
    }
   public void setName(String EmpName){
      this.name=EmpName;
   }
   public String getName(){
       return name;
   }
   public void setSalary(int s){
      this.salary=s;
   }
   public int getSalary(){
       return salary;
   }

}


public class CWH_ch9_oops_quiz {
    public static void main(String[] args) {
        EmployeeSalary john=new EmployeeSalary("Mr John Kumar Rao"); //passing arguments to Constructor.
        System.out.println("Salary is :"+ john.getSalary());
        System.out.println("Name is : " + john.getName());
    }
}
