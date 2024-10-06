
//Problem no 5 , and 6.

// Define the TvRemote interface
interface TvRemote{
    //Basic Tv remote function
    void channelChange();

    void VolumeControl();

    void Switch();

}

// Define the SmartTvRemote interface that extends TvRemote
interface  SmartTvRemote extends TvRemote {
    void TouchPad();

    void VoiceControl();

    void BluetoothWiFi();

}
//myTv implements SmartTvRemote ko.........
class myTv implements SmartTvRemote{
  public void channelChange(){
      System.out.println("You can Navigate Through Channels");
  }

    public  void VolumeControl(){
        System.out.println("We can Control Volume ");
    }

    public void Switch(){
        System.out.println("we can Switch ON/OFF through it ");
    }
    public void TouchPad(){
        System.out.println("It's SmartTv touchPad..............");
    }

    public  void VoiceControl(){
        System.out.println("control Voice of music............");
    }

    public  void BluetoothWiFi(){
        System.out.println("We Can enjoy Live Streaming of Events........");
    }
}


public class CWH_ch11_interface_60_ps2 {
    public static void main(String[] args) {
        myTv Tv = new myTv();

        Tv.channelChange();
        Tv.VolumeControl();
        Tv.Switch();

        Tv.TouchPad();
        Tv.VoiceControl();
        Tv.BluetoothWiFi();

    }
}
