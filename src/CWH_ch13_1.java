
//Multithreading............

class myThread1 extends Thread{
    @Override
    public void  run(){
        int i=0;
while(i<100){

    System.out.println("My cooking Thread is running .............");
    System.out.println("I am happy.");
    i++;
}
    }
}

class myThread2 extends Thread{
    @Override
    public void  run(){
        int i=0;
        while(i<100){

            System.out.println("thread is running for chatting her .............");
            System.out.println("I am sad.");
            i++;
        }
    }
}

public class CWH_ch13_1 {
    public static void main(String[] args) {
myThread1 t1 =new myThread1();
myThread2 t2 =new myThread2();
/* this will be executed concurrently */

t1.start();
t2.start();

        /*

        //This will execute completely first one  t1 then t2 will execute.
        t1.run();
        t2.run();

         */
    }
}
