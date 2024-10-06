

//Method --------------Recursion _________________

public class CWH_ch7_recursion {
    // factorial (0)=1;
    // factorial (n)=n*(n-1)*...................1;    for all (n>=1)
    // factorial (5)= 5*4*3*2*1=120;
    //factorial(n)=n* factorial(n-1);
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);  //recursion
        }
    }
    static int factorial_iterative(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product=1;
            for (int i=1;i<=n;i++){
                product=product*i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x=6;
      int a=  factorial(x);
        System.out.println("Factorial of "+ x + " with Recursion  is " +a);
        System.out.println("Factorial of "+ x + " with for loop is " +factorial_iterative(x));
    }
}
