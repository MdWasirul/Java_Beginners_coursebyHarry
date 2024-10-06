import  java .util.Scanner;
public class CWH_ch7_method_ps_fibonacci {
        public static void printFibonacciSeries(int n) {
            if (n <= 0) {
                System.out.println("Number of terms must be positive.");
                return;
            }

            if (n == 1) {
                System.out.println("0");
                return;
            }

            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print(firstTerm);

            if (n > 1) {
                System.out.print(" " + secondTerm);
            }

//            System.out.print(firstTerm + " " + secondTerm);

            for (int i = 2; i < n; ++i) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(" " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println(); //move to next line

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int terms = scanner.nextInt();

            printFibonacciSeries(terms);
        }

}
