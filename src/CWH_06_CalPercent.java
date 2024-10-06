import java.util.Scanner;

public class CWH_06_CalPercent{
    public static void main(String[] args) {
        float TotalMarks=500f; //----Total marks of all five Subject is 500.

        System.out.println("Taking Marks  from User ");
        Scanner S= new Scanner(System.in);
        System.out.println("Enter first Subjects Marks  ");
        float Subj1=S.nextFloat();
        System.out.println(Subj1); //--------------Subject 1.
        System.out.println("Enter second subject Marks ");
        float Subj2=S.nextFloat();

        System.out.println("Enter Third Subject Marks ");
        float Subj3=S.nextFloat();

        System.out.println("Enter Fourth Subject Marks ");
        float Subj4=S.nextFloat();

        System.out.println("Enter fifth Subject Marks  ");
        float Subj5=S.nextFloat();
        System.out.println(Subj5);
        System.out.println("Sum of these Marks is : ");
        float sum=Subj1+Subj2+Subj3+Subj4+Subj5;
        System.out.println(sum);

        System.out.println(" Now Calculating percentage of Students Marks");
        float MarksPercentage=(sum/TotalMarks*100);
        System.out.println("Percentage Of The  Marks obtained by  The Students  is " +MarksPercentage+"%");



    }



}
