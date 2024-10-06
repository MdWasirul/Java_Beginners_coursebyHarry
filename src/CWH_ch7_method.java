public class CWH_ch7_method {
      static int logic(int x ,int y){
        int z;
        if (x>y){
            z=x+y+5;
        }else{
            z=(x+y)*2;
        }
//        x=345; // value of main method will not change .even if  we modify the value of  a and b;
          return z;
    }
    public static void main(String[] args) {
        int a=23;
        int b=20;
        int c;
//        c=a+b;
        c=logic(a,b);

       // --------------------|.
        //method invocation using Object Creation
//        CWH_ch7_method obj1=new CWH_ch7_method();
//        c=obj1.logic(23,20);

        //-----------------------|
        int a1=30;
        int b1=20;
        int c1;
//        c1=a1+b1;
        c1=logic(a1,b1);
        System.out.println("sum is : " + c);
        System.out.println("Sum of Number is : " +c1);
    }
}
