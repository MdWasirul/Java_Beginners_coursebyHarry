
//This and Super Keyword
 class EkClass {
    int a;

    public int getA() {
        return a;
    }

//    EkClass(){} //default const.


    EkClass(int v) {
        this.a = v;
        //without 'this ' it shows (0) zero as  {a=a}
    }

//
//    public int ReturnOne() {
//        return 1;
//    }
}
   class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am constructor  " );
    }
   }




public class CWH_ch10_inherit_thisKeyword {
    public static void main(String[] args) {
        EkClass ek=new EkClass(7);
        DoClass d=new DoClass(5);
        System.out.println(ek.getA());

    }
}
