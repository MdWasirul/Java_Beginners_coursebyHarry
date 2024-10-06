import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class CWH_ch4_PS_q1 {
    public static void main(String[] args) {
        //problem number -01----------------
//         int a=10;
//        if (a=11)  //shows an error
//        {
//            System.out.println("I am 11 ");
//         }else {
//            System.out.println("I am not 11");
//        }
            //Question  -02------------------------
//         Scanner sc =new Scanner(System.in);
//        System.out.println("Enter Subject 1 marks :");
//         byte physics=sc.nextByte();
//        System.out.println("Enter Subject 2 marks :");
//         byte chemistry=sc.nextByte();
//        System.out.println("Enter Subject 3 marks :");
//         byte Maths=sc.nextByte();
//         float avg=(physics+chemistry+Maths)/3.0f;
//        System.out.println("Average overall is : "+avg+"%");
//         if(avg>=40 && physics>=33 && chemistry>=33 && Maths>=33){
//             System.out.println("You are promoted to Next class");
//         }
//         else {
//             System.out.println("You are not promoted to next class");
//         }
        ///----------------question no-3 ---------------------
//         Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax=0;
//        float income =sc.nextFloat();
//        if (income<=2.5)
//        {
//            tax=tax+0;
//
//        } else if (income>2.5 && income <=5f) {
//            tax=tax+0.05f*(income-2.5f);
//
//        } else if (income >5f && income<=10.0f) {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.02f *(income-5f);
//        } else if (income>10.0f) {
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(10.0f-5.0f);
//            tax=tax+0.3f *(income-10.0f);
//        }
//
//        System.out.println("The Total Tax to be paid is : "+tax);
//
        // ------------------Question 04----- WE WILL ENHANCED Switch.
//          Scanner sc =new Scanner(System.in);
//        int day=sc.nextInt();
//        switch(day){
//            case 1-> System.out.println("The day is MONDAY");
//            case 2-> System.out.println("The day is TUESDAY");
//            case 3-> System.out.println("The day is WEDNESDAY");
//            case 4-> System.out.println("The day is THURSDAY");
//            case 5-> System.out.println("The day is FRIDAY");
//            case 6-> System.out.println("The day is SATURDAY");
//            case 7-> System.out.println("The day is SUNDAY");
//
//        }
//             Scanner sc =new Scanner(System.in);
//             String website=sc.next();
//             if (website.endsWith(".com")){
//                 System.out.println("The website is a commercial website");
//             } else if (website.endsWith(".org")) {
//                 System.out.println("The website is a organizational website");
//             } else if (website.endsWith(".in")) {
//                 System.out.println("The website is a Indian website ");
//             }
        Scanner sc =new Scanner(System.in);
        int year=sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            System.out.println("The year is a leap year");
        } else {
            System.out.println("Year is Not a leap Year");

        }

    }
}
