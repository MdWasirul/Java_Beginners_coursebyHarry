
class  Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x value now ");
        this.x = x;

    }

    public  void PrintMe(){
        System.out.println("Hello i am Constructor ");
    }
}


class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("hello i am in Derived and setting y value ");
        this.y = y;
    }
}

public class CWH_ch10_OOP_Inherit {
    public static void main(String[] args) {
        //run Base class
        //creating object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating object of Derived class
        //run base class and derived class object also
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());


        d.setY(82);
        System.out.println(d.getY());

    }
}



