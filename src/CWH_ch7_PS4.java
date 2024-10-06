public class CWH_ch7_PS4 {
    // problem no -08----------Q. 02.  using recursion .
    static void pattern1_rec(int n){
        if (n<0){
            System.out.println("Enter the value of n positive:");
        }
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //problem no 08.
        //Recursion ...........
        pattern1_rec(4);
    }
}
