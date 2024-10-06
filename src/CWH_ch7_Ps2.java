public class CWH_ch7_Ps2 {
    // problem no 03
    //sum(4) =1+2+3+4=10
    //sum(n)=1+2+3+4+5+6++..........+n.
    //sum(n)=1+2+3+4+5+..................+(n-1) +n.
    //sum(n)=sum(n-1)+ n.

    //sum(3)= 3 +sum(2).
    //sum(3)=3+2+ sum(1).
    //sum(3)=3+2+1

    static  int sumRec(int n){
         // Base condition.
        if(n==1){
            return 1;
        }
        return n+ sumRec(n-1);
    }

    //Pattern 1.
    static void pattern2(int n){
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //problem 3
        int c;
        c=sumRec(3);
        System.out.println("sum :"+ c);
        System.out.println(sumRec(6));


        //problem no 04
        pattern2(4);
        pattern2(5);
        pattern2(6);
    }
}
