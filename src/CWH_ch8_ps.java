//--------------------problem no-1---------------


class Employee1 {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }

}


       //-------------problem no -02--------------------------------
class cellphone{
    public void ringing(){

        System.out.println("Ringing...............");
    }
    public void vibrating(){
        System.out.println("Vibrating...............");
    }

}
  /*
  //-----------------problem no  03.-------------------

class calcSquare{
    int side;
    public int area(){
        return  side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
*/

//--problem no 4. calc same for Rectangle -----

//problem no -05.
class Tommy{
    public void  hit(){
        System.out.println("Hitting the enemy....................");
    }
    public void  run(){
        System.out.println("Running from enemy...................");
    }
    public void  fire(){
        System.out.println("Firing on enemy.................");
    }


}


public class CWH_ch8_ps {
    public static void main(String[] args) {
        /*
//       ------------- Problem -1-------------------------//
          Employee1 harry =new Employee1();
          harry.setName("CodeWithHarry");
        harry.salary=3456;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());


          //----------------problem -02-----------------------

        cellphone jonny = new cellphone();
        jonny.ringing();
        jonny.vibrating();

*/
        /*
        //problem no 03.
        calcSquare sq = new calcSquare();
         sq.side=5;
        System.out.println(sq.area());  //25
        System.out.println(sq.perimeter()); //20

*/
        //problem 05.

 Tommy player1=new Tommy();
 player1.hit();
 player1.fire();
 player1.run();

    }
}
