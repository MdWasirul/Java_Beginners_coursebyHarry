public class CWH_ch5_loop_3 {
    public static void main(String[] args) {
        //----------------------For Loop-------------
//        System.out.println("----------------------For loop-----------------------");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
            // 2n=Even Number =0,2,4,6,8
            //3n=Odd Number=3,5,7,9,11
        System.out.println("Printing first n Odd Numbers -------------");
//         int n=10;
        // for(in i=o;i<n;i++){}
        System.out.println("First  n Odd number are : ");
        for (int i=0;i<=10;i++)
        {
            System.out.println(2*i+1);  // 1,3,5,7,9,11,13,15,17,19,21

        }
        //----------------------------Even Number------------
        System.out.println("__Now Print n Even Number ---------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(2 * i); // 0,2,4,6,8,10,12,14,16,18,20
        }
        //------------------Decrementing for loop------
        System.out.println("Number in Reverse Order-----------");
        int n=100;
        for (int i=n;i>0;i--){      // ---Here we can write  i>0 or i!=0 Both are same;
            System.out.println(i);  //10,9,8,7,6,5,4,3,2,1 [(i=10;i>0;i--)]
        }
    }
}
