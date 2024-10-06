
interface Bicycle2{
   int a=45;   //by default properties are --> final,static,public
    void applyBrake(int decrement);
    void speedUp(int increment);
}

//-----------------2nd Interface----------
interface HornBicycle{
    int x =78;
    void blowHornK3g();     //Interface methods are public by default.
    void blogHornMann();
}

class AvonCycle implements Bicycle2 ,HornBicycle{
//   public int x =4;           // Needs to define the method ( not field)
    void blowHorn(){
        System.out.println("pee pee poo poo ");
    }
  public  void applyBrake(int decrement) {
      System.out.println("Applying Brakes ");
  }


   public void speedUp(int increment){
       System.out.println("Applying Speed ");
    }

   public void blowHornK3g(){
       System.out.println("Kabhi Khushi kabhi Gum  pee pee pee pee ");
   }
    public   void blogHornMann(){
        System.out.println("Mai hoon naa  poo poo poo poo poo ");
    }
}

public class CWH_ch11_interface_55 {
    public static void main(String[] args) {
        System.out.println("hello");

        AvonCycle objCycle=new AvonCycle();
        objCycle.applyBrake(1);
        //You can create properties in interfaces
        System.out.println(objCycle.a);
        System.out.println(objCycle.x);

        //You cannot modify the properties  in Interfaces as they are final
//         objCycle.a=4556;  //Cannot assign a value to final variable 'a
//        System.out.println(objCycle.a);

  //for HornBicycle Interfaces  //We can use  multiple Interfaces in one Class
        objCycle.blowHornK3g();
        objCycle.blogHornMann();

    }
}
