


interface Camera{
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

interface Wifi{
    String[] getNetworks();
    void connectNetwork(String network);
}

class MyCellPhone{
    void CallNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);

    }

    void pickCall(){
        System.out.println("Connecting.....................");
    }

}



class MySmartPhone extends MyCellPhone implements  Camera,Wifi{
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



public class CWH_ch11_interface_57 {
    public static void main(String[] args) {
  MySmartPhone ms =new MySmartPhone();
  ms.recordVideoIn4K();
//  ms.greet(); //-----------> Throws an error!
  String[] arr=ms.getNetworks();
  for (String item: arr){
      System.out.println(item);

  }
    }
}
