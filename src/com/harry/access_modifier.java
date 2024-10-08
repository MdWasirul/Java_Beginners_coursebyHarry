package com.harry;
// Access Modifier in java  public-protected-no modifier-private.

class C1{
 public int x=34;
 protected  int y=15;
 int z =10;
 private  int a=25;
 public void meth1(){
     System.out.println(x);
 }
}
class C2{

}
public class access_modifier {
    public static void main(String[] args) {
C1 access=new C1();
access.meth1();
    }
}
