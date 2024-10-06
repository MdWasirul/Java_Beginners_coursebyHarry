public class CWH_ch5_loop {
    public static void main(String[] args) {
        //simple method ;
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        //BY loop method-------------
        System.out.println("LOOP CONTROL INSTRUCTION ");
        int i=1;
        while (i<=3){
            System.out.println(i);
            i++;
        }
        System.out.println("Finishing  the loop after execution ");
   //------------------------------Infinite loop.---------------
//        while(true){
//            System.out.println("HI I am a  BCA Student .");
//        }
        //------------------------------------ Quick Quiz--------------------------------------
        /* write a program to print natural number from 100 to 200.
         */
        System.out.println("The natural number from 100 to 200 is :   ");
      int a=100;
      while(a<=200){
          System.out.println(a);
          a++;
      }
        System.out.println("above number is natural Number ");

    }
}
