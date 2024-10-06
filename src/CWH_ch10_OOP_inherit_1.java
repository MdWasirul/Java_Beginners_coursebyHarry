
/*
 Quick Quiz
 Create a Class Animal and Derive another class Dog from it .

 */
class Animal{

int foot;

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        System.out.println(" Animal has four feet  ");
        this.foot = foot;
    }
}

class Dog extends  Animal{
    String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        System.out.println("This is Dog  and  it barks ");
        this.bark = bark;
    }
}

public class CWH_ch10_OOP_inherit_1 {
    public static void main(String[] args) {
 //Quick Quiz

        Dog d=new Dog();
        d.setFoot(4);
        System.out.println(d.getFoot());
        d.setBark("barking");
        System.out.println(d.getBark());


    }
}
