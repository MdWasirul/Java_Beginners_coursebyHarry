
////Create thread using implementing runnable interface.

class myThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am thread 1 NOt a threat 1");
            i++;
        }
    }
}

class myThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am thread 2 NOt a threat 2");
            i++;
        }
    }
}

public class CWH_ch13_2 {
    public static void main(String[] args) {

      // myThreadRunnable1 t1= new myThreadRunnable1();
      // myThreadRunnable2 t2 =new myThreadRunnable2();
      // t1.start();
      // t2.start();
     // when we implements Runnable interface  then we cannot directly run start() method.


        //---------------------------------------------------------
        myThreadRunnable1 bullet1= new myThreadRunnable1();
        Thread gun1 =new Thread(bullet1);

        myThreadRunnable2 bullet2 =new myThreadRunnable2();
        Thread gun2 =new Thread(bullet2);

        gun1.start();
        gun2.start();

    }

}
