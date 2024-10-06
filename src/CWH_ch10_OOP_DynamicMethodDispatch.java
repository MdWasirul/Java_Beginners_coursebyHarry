 //______Dynamic Method Dispatch  --------
class Phone{
    public void On(){
        System.out.println("Turning On Phone ");
    }
    public void ShowTime(){
        System.out.println("You are Welcomed at 8 AM ");
    }
}
class SmartPhone extends Phone{
    public void On(){
        System.out.println("Turning ON SmartPhone");
    }
    public void music(){
        System.out.println("Playing Music ");
    }
}


public class CWH_ch10_OOP_DynamicMethodDispatch {
    public static void main(String[] args) {
     //   Phone obj = new Phone();                 //Allowed
      //  SmartPhone smObj=new SmartPhone();        //Allowed
      //  obj.name();

        Phone obj =new SmartPhone();         //Yes it is Allowed

//        SmartPhone obj2=new Phone(); //Not Allowed
          obj.ShowTime();
//          obj.music();   //Not Allowed
          obj.On();         //Runs the object Method and it doesn't run the reference method

    }

}
