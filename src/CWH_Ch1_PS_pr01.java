
import java.util.Scanner;

public class CWH_Ch1_PS_pr01 {
    public static  void main(String[] args){

        //Question 1
//        int a =56;
//        int b=89;
//        int c=84;
//        int sum=a+b+c;
//        System.out.println("Sum of the three numbers is : ");
//        System.out.println(sum);

//question 2 --Calculate CGPA of marks
//        float Subject1=67;
//        float Subject2=78;
//        float Subject3=89;
//        float cgpa= (Subject1+Subject2+Subject3)/30;
//        System.out.println("CGPA of Marks of  is : ");
//        System.out.println(cgpa);

        //question number 3.
//        System.out.println("Enter your Name ");
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("Hello " + name +", have a good day! ");


        // Question 3  km to miles
        System.out.println("Enter the Kilometer ");
        Scanner sc =new Scanner(System.in);
        float KiloMeter=sc.nextFloat();
        System.out.println(KiloMeter + " KM equal to " + (KiloMeter*0.62137119) +" miles");



        // question 5 -----
        System.out.println("Enter number ");
        Scanner Sca =new Scanner(System.in);
        System.out.println(Sca.hasNextInt());

    }
}
