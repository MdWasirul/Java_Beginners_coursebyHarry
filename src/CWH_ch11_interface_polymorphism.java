//Polymorphism using Interfaces

interface MyCamera2{
    void takeSnap();
    void recordVideo();


    private void greet(){
        //Interface can also include private methods for default method to use

        System.out.println("Good Morning");
    }
    default void recordVideoIn4K(){   // Is overridden in MySmartPhone

        greet();      //Interface can also include private methods for default method to use
        System.out.println("Recording Video in 4K.......................");
    }
}

interface Wifi2{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone2{
    void CallNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);

    }

    void pickCall(){
        System.out.println("Connecting.....................");
    }

}


class MySmartPhone2 extends MyCellPhone implements  MyCamera2,Wifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video .................");
    }

    //Override method in Camera
//    @Override
//    public void recordVideoIn4K(){
//        System.out.println("Recording Video in 4K....and Taking snap...................");
//    }

    public String[] getNetworks(){
        System.out.println("Getting List of Network ..........");
        String[] networkList={ "Harry" ,"Prashant" ,"Anjani"};
        return networkList;
    }
    public  void connectNetwork(String network){
        System.out.println("Connecting to ...."+ network);
    }
}

public class CWH_ch11_interface_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam2=new MySmartPhone2(); //This is a Smartphone but, use it  as a Camera
//        cam2.getNetworks();  //---->NOt allowed
        cam2.recordVideoIn4K();  //  ------- it will Run

     MySmartPhone2 sm=new MySmartPhone2();
     sm.recordVideo();
     sm.getNetworks();
     sm.connectNetwork("harry");
     sm.CallNumber(62106712);
     sm.pickCall();
    }
}
