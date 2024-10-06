public class CWH_ch7_method_overloading2 {
    //Overloaded function foo
    //Method overloading cannot be performed  by changing the return type
    static void foo(){
        System.out.println("Good Morning  bro !");
    }
    static void foo(int a){
        System.out.println("Good Morning !"+ a +" \t Brother!" );
    }
    static void foo(int a,int b){
        System.out.println("good Morning Bro ! " + a);
        System.out.println("good Morning Bro ! " + b);
        System.out.println("good Morning Bro ! " + a +" " + b);
    }
//    static int foo(int a,int b ){  //int c--->No Error
//                                    //But same method shows error -->method foo(int ,int) all ready defined .
//        System.out.println("good Morning Bro ! " + a);
//        System.out.println("good Morning Bro ! " + b);
//        System.out.println("good Morning Bro ! " + a +" " + b);
//        return 3;
//    }

    public static void main(String[] args) {
       // Method Overloading
        foo();
        foo(786);
        foo(3000,4000);       //Arguments are Actual.


    }
}
