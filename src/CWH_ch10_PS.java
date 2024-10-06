class Circle {
    public int radius;

    Circle(){
        System.out.println("I am Non parametrize constructor ");
    }

    public Circle(int r){
        System.out.println("I am Circle Parametrize Constructor");
        this.radius=r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

}


class CylinderClas extends Circle {
    public int height;
 CylinderClas(int r,int h){
     super(r);             // in absence of Super() keyword it will print default Constructor of SuperClass.
     System.out.println("i am Cylinder's parametrize Constructor");
     this.height = h;
}
    public double Volume() {
    return Math.PI *this.radius *this.radius*this.height;
    }
}


public class CWH_ch10_PS {
    public static void main(String[] args) {
  //-------------------Problem 1---------------------

//        Circle objC=new Circle(4);
//        System.out.println(objC.area());   //Print Area of Circle

        CylinderClas ObjCylinder=new CylinderClas(4,6);
        System.out.println(ObjCylinder.Volume());        //print Volume of Cylinder


    }
}
