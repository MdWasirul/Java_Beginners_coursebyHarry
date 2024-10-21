
//Thread Constructor
/*
  Constructor() Summary.

Constructor and Description
 *. Thread()
Allocates a new Thread object.
*. Thread(Runnable target)
Allocates a new Thread object.
 *. Thread(Runnable target, String name)
Allocates a new Thread object.
 *. Thread(String name)
Allocates a new Thread object.
 */


class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i< 35){
            System.out.println("I am a Thread");
            i++;
        }

    }
}
public class CWH_ch13_3 {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 =new MyThr("Wasirul");
        t1.start();
        t2.start();
        System.out.println("The id of Thread t is : " +t1.getId());
        System.out.println("The name of Thread is : "+ t1.getName());
        System.out.println("------------------------------");
        System.out.println("The id of Thread t is : " +t2.getId());
        System.out.println("The name of Thread is : "+ t2.getName());
    }
}

/* Output--
 I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
I am a Thread
The id of Thread t is : 22
The name of Thread is : Harry
------------------------------
The id of Thread t is : 23
The name of Thread is : Wasirul
 */