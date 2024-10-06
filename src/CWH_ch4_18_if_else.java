import java.sql.SQLOutput;
import java.util.Scanner;
public class CWH_ch4_18_if_else {
    public static void main(String[] args) {
        //if-else-if   ----ladder
        Scanner sc=new Scanner(System.in);  //Taking input from user.
        int age=sc.nextInt();
      /*
       if (age>59){
            System.out.println("yes you can travel as Senior citizen");
        } else if (age>46) {
            System.out.println("You can travel as Semi-Senior citizen");

        } else if (age>36) {
            System.out.println("YOU can Travel as semi-semi-Senior citizen");
        }
        else {
            System.out.println("you can not  travel");
        }
        */
        //-----------------------------Switch statement ----------
        switch (age)
        {
            case 18:
                System.out.println("You can cast your vote.");
                break;
            case 24:
                System.out.println("you should do your Job.");
                break;
            case 60:
                System.out.println("YOU can retired from your Job.");
                break;
            default:
                System.out.println("you can  Enjoy your life.");

        }
        System.out.println("your Health is good .YOU should continue your Exercise. ");

    }
}
