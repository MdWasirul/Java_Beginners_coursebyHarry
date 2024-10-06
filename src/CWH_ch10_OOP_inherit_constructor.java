


class Base1{
      Base1(){              // constructor ----------------
         System.out.println("I am  a  Base Constructor ");
     }
     Base1(int x){
         System.out.println("Hello I am overloaded Base class Constructor with a value  as : " + x);
     }

}
class Derived1 extends Base1{
   Derived1(){
//       super(1);
       System.out.println("I am Derived class Constructor ");
    }
    Derived1(int x,int y){
       super(x);
        System.out.println("Hello I am overloaded Derived class Constructor with y value  as : " + y);
    }

}
  class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am child of Derived1 Constructor");
    }
      ChildOfDerived(int x,int y,int z){
        super(x,y);
          System.out.println("Hello I am overloaded ChildOfDerived class Constructor with z value  as : " + z);
      }
  }

public class CWH_ch10_OOP_inherit_constructor {
    public static void main(String[] args) {                /* C1---->C2----->C3   */
//        Base1 b =new Base1();
//        Derived1 d =new Derived1();

//        Derived1 d =new Derived1(43,67);

//        ChildOfDerived cd =new ChildOfDerived();
        ChildOfDerived cd =new ChildOfDerived(85,87,88);
    }
}
