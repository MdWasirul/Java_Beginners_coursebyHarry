/*
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)
 */
//import java.util.Scanner;

//import java.util.*; //Import all classes from java.util Package

public class CWH_ch12_Packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in); //--direct import scanner class
//        int a = sc.nextInt();
//        System.out.println("Taking input from user :" +a);
        System.out.println("This is my scanner");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("done....");

        System.out.println("package is used to group java class files and we can see it.");
    }
}
