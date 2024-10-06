public class CWH_10_ch2 {
    public static void main(String[] args) {
//        int x =5;
//        byte y=8;
//        short z=6;
//        int a=y+z;
//        float b=6.08F +z;
//        System.out.println(a);
//        System.out.println(b);

        //---------------Decrement and Increment Operator----------------.
         int i=56;
//         int b=i++;   //first b is assigned i and then i is incremented ;
        int j=68;
        int c= ++j; //first j is incremented and then c is assigned j(69);
        System.out.println(c);  //69

         System.out.println(i++);  //56

        System.out.println(i); //57
        System.out.println(++i); //58
        System.out.println(i);  //58

        System.out.println("-------Decrement Operator ");
        int p=78;
        System.out.println(p--); //78
        System.out.println(p);  //77
        System.out.println(--p);//76
        System.out.println(p); //76
//    //quick :what is the value of the following expression.
//        System.out.println("quick quiz--------");
//
//        int y = 7;
//        int x = ++y * 8;
//         System.out.println(x);

        char a='B';
        a++;
        System.out.println("a is now : " +a);
}
}




