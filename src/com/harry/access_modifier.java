package com.harry;
// Access Modifier in java  public-protected-no modifier-private.

class C1{
 public int x=34;
 protected  int y=15;
 int z =10;
 private  int a=25;

 public void meth1(){          //method
     System.out.println(x);

     System.out.println(y);
     System.out.println(z);
     System.out.println(a);
 }
}
class C2{

}
public class access_modifier {
    public static void main(String[] args) {
C1 access=new C1();
//access.meth1();
        System.out.println(access.x);
        System.out.println(access.y);
        System.out.println(access.z);
//        System.out.println(access.a);  //'a' has private access in 'com.harry.C1'
    }
}
