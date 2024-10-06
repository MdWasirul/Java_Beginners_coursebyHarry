 //Practice set  9.
 //Problem no 01; --->set radius and height of cylinder


 // -------------------------------------Cylinder --------------------------
class Cylinder{
   private float radius ;
   private float height;


     //Constructor----------------------->
     public Cylinder(float height, float radius) {
         this.height = height;
         this.radius = radius;
     }


     public float getRadius(){

         return radius;
     }

   public void setRadius(float cylRadius){
       this.radius=cylRadius;
   }

   public float getHeight(){
         return height;

   }

   public void setHeight(float cylHeight){
       this.height = cylHeight;
   }

   public double SurfaceArea(){
         return  2 *Math.PI*radius*height + 2 * Math.PI *radius*radius;
//         return  2 *Math.PI *radius *(height +radius);
   }
   public double VolumeCylinder(){
       return  Math.PI * radius * radius *height;

   }

}

   //-------------------------Rectangle -----------------------

class Rectangle{
    private final int length;
    private int breadth;

    public Rectangle() {     //Default Constructor
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

 // --------------------sphere----------------------------

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double SurfArea(){
        return 4* Math.PI * radius *radius;
    }
}

public class CWH_ch9_oops_PS {
    public static void main(String[] args) {
     /*
        //problem no -01.
        Cylinder harry=new Cylinder();
        harry.setHeight(12);
        float h = harry.getHeight();
        System.out.println(h);

        harry.setRadius(4);
        float r = harry.getRadius();
        System.out.println(r);



        //problem no -02
        Cylinder harry=new Cylinder();
        harry.setRadius(5);
        harry.setHeight(12);
        System.out.println("Surface Area of Cylinder is : "+ harry.SurfaceArea() +" sq Units");
        System.out.println("Volume Of Cylinder is : " + harry.VolumeCylinder() + " sq Units");

     */

  /*
        //problem no-03
        Cylinder harry =new Cylinder(12,5);
        float h = harry.getHeight();
        System.out.println(h);
        float r = harry.getRadius();
        System.out.println(r);
        System.out.println("Volume = "+ harry.VolumeCylinder());
        System.out.println("Surface Area " + harry.SurfaceArea());

 */

        /*

        // problem no -04
        Rectangle r =new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        Rectangle s=new Rectangle(8,6);  //Constructor with argument.
        System.out.println(s.getLength());
        System.out.println(s.getBreadth());


         */

      //problem no -05.

        Sphere sp = new Sphere();
        sp.setRadius(5);
        System.out.println(sp.getRadius());
        System.out.println("Surface Area of Sphere is : " + sp.SurfArea() + " sq units");

    }
}
