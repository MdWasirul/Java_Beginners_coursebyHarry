public class CWH_ch7_PS3 {

    // problem 5
    static int fib(int n){
        if(n==1 || n==2){
            return (n-1);
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    // problem no-06.
    // Method to calculate the average of numbers using varargs
    static double avgNum(int ... arr){
        // available as int [] arr.
//        int avg;
        if (arr.length == 0) {
            return 0; // Avoid division by zero
        }
        int sum = 0;
        for (int a : arr) {

            sum = sum + a;
        }
        return (double) sum / arr.length;
    }


    public static void main(String[] args) {
    // problem no 5
        int result = fib(5);
        System.out.println("Result is : " + result);

        // problem no 6
        double Average = avgNum(16, 5, 7, 8, 312);
        System.out.println("Average of number is : " + Average);
        double aVrg=avgNum(0);
        System.out.println(aVrg);
    }
}
