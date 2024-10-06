
//Problem 2 Create Rectangle and use inheritance to create another class Cuboid

class Rectangle1{
    public int length;
    public  int breadth;
 Rectangle1(){

 } //default Constructor
    Rectangle1(int l,int b){
        System.out.println("I am Rectangle Parametrize Constructor");
        this.length=l;
        this.breadth=b;
    }
     public int area(){
         return  length * breadth;
     }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
class Cuboid extends Rectangle1{
    public int height;

Cuboid(int l,int b,int h){
    super(l,b);
    System.out.println("I am Cuboid Constructor ");
    this.height=h;
}
    public int Volume(){
        return length * breadth * height;
    }
}

public class CWH_ch10_PS2 {
    public static void main(String[] args) {

//        //problem 2
//        Rectangle1 obj1 = new Rectangle1(3,5);   //area of Rectangle
//        System.out.println( obj1.area());

        //----Cuboid Object Creation
         Cuboid obj2=new Cuboid(2,3,5);  // volume of Cuboid .
        System.out.println(obj2.Volume());

        Rectangle1 obj1 = new Rectangle1();
        obj1.setBreadth(5);
        obj1.setLength(7);
        System.out.println(obj1.getBreadth());
    }
}
