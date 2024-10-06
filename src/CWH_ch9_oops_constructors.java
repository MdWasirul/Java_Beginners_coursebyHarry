
class myMainEmployee{
private int id;
private String name;

public myMainEmployee(){       //--------> Constructor
    id=67;
    name="haris Ali Khan";
}
    public myMainEmployee(String myName,int myId){       //--------> Constructor with parameter
        id = myId;
        name = myName;
}
    public myMainEmployee(String myName){       //--------> Constructor
        id=87;
        name=myName;
    }
    public myMainEmployee(int myId){       //--------> Constructor
        id=myId;
        name="haris Ali Khan";
    }

public String getName(){
    return name;
}

public void setName(String n){
    this. name=n;
}
public void setId(int i){
    this.id=i;
}
public int getId(){
    return id;
}

}


public class CWH_ch9_oops_constructors {
    public static void main(String[] args) {
//     myMainEmployee harry=new myMainEmployee();// simple consructor
    // harry.setName("Mohammad Ali Khan");
    // harry.setId(45);
//        myMainEmployee harry = new myMainEmployee("Haris Ahmed Junaidi", 101);//Object of constructor with  method arguments
//        myMainEmployee harry=new myMainEmployee("Shera");
        myMainEmployee harry=new myMainEmployee(786);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }

}
