/*Practice Set Exercise 11 - Abstract class ,interface, and polymorphism

 */
//Question -01

  abstract class Pen{
     abstract public void write();
     abstract public void refill();
} // Q1 + Q2.
class FountainPen extends Pen{
    public void ChangeNib(){
        System.out.println("Changing the Nib.....");
    }
   public void write(){
       System.out.println("write...");
    }
     public void refill(){
         System.out.println("Refill....");

    }

}

//  Problem no -3
class Monkey{
      void jump(){
          System.out.println("Jumping .......");
      }
      void bite(){
          System.out.println("act like biting..");
      }
}
  interface BasicAnimal {
      void eat();
      void sleep();
  }
class Human extends Monkey implements BasicAnimal{
      public void speak(){
          System.out.println("Hello sir");
      }
      public void eat(){
          System.out.println("Humans take meals 3 times daily ");
      }
      public void sleep(){
          System.out.println("Minimum sleep time is  6-7 hours daily");
      }
}
//----------problem -4------------------------||
 abstract class Telephone{

    // Telephone class implementation

     abstract public void ring();
      abstract public void lift();
     abstract public void  disconnect();

}
class SmartTelephone extends Telephone{

    // SmartTelephone class implementation-------

      @Override
    public void ring(){
        System.out.println(" Telephone is Ringing..........");
    }
    @Override
    public void lift(){
        System.out.println("Phone is Pickup by a Person");
    }
    @Override
    public void  disconnect(){
        System.out.println("Call is Disconnected .........");
    }

    // Additional method specific to SmartTelephone
    public void VideoCall(){
        System.out.println(" Video Call is Ongoing... ");
    }
}

public class CWH_ch11_interface_60_ps {
    public static void main(String[] args) {
//        //Q1 + Q2.
//        FountainPen fp = new FountainPen();
//        fp.ChangeNib();
//        fp.refill();
//        fp.write();

 //Problem -03
//        Human hm =new Human();
//        hm.eat();
//        hm.sleep();
//        hm.bite();
//        hm.jump();

        // problem -5
//        Monkey m1=new Human();
////        m1.speak(); //-->Can not use speak() method because reference is monkey which does not have speak() method .
//      m1.jump();
//      m1.bite();
//
//      BasicAnimal b1 =new Human();
////      b1.speak(); // --->show an Error
//        b1.eat();   //it will run
//        b1.sleep();

        //problem no -04
        System.out.println("\n solving problem no 4...");

        /*//  we can now use tp as a Telephone reference, but it points to a SmartTelephone object.
           // tp is a reference of type Telephone.
        // new SmartTelephone() creates an object of type SmartTelephone.
         */
       Telephone tp= new SmartTelephone();  // (Demonstrating polymorphism....)
       tp.disconnect();
       tp.lift();
       tp.ring();
//       tp.VideoCall(); //Shows an error.....

    }
}
