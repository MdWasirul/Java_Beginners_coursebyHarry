public class CWH_ch7_PS {
    static void printMultiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d \n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print("*  ");
            } 
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // Problem - 01;
//        System.out.println("Multiplication Table is : \n");
//        printMultiplication(4);

//          problem -02.
        pattern1(14);

    }
}
