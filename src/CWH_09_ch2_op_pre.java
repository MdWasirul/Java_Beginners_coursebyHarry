public class CWH_09_ch2_op_pre {
    public static void main(String[] args) {
//       int a =67*2-34/2;
//        System.out.println(a);//117
      //  int b =6*5-34/2;
        /*
        Highest precedence goes to * and /.Then they are evaluated on the basis of  left to right associativity.
       30-34/2
       30-17
       13.
        */
//        System.out.println(b);
      //  int c =60/5-34*2;   // L---->R associativity
        /*

        12-68
        -56
        */
//        System.out.println(c);
        // operator precedence and Associativity
      //----------------------
        // Quick Quiz-----
        int x=6;
        int y=1;
        int k =x*y/2;
        System.out.println(k);
        int a=5;
        int b=1;
        int c=4;
        int m=(b*b-4*a*c)/(2*a);
        System.out.println(m);
    }
}
