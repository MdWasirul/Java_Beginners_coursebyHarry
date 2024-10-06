
//Abstract Classes and Abstract Method

 abstract class parent{
  public parent(){
        System.out.println("It Is A Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
     abstract public void greet2(); //abstract method in abstract Class
}
class child extends parent{
@Override
    public void greet(){

        System.out.println("Good Morning ");
    }@Override
    public void greet2(){
        System.out.println("Good Afternoon ");
    }
}
 abstract class child3 extends parent{
     public void th(){
     System.out.println("I am Good");
      }
  }


public class CWH_ch11_abstract_53 {
    public static void main(String[] args) {
//        parent pc=new parent();   //parent' is abstract; cannot be instantiated----->error
      child  c=new child();
// child3 cd=new child3(); //parent' is abstract; cannot be instantiated ---->error

    }
}
