public class CWH_ch7_method_overloading1 {
    static void change(int a){
        a=89;
    }
    static void change2(int [] arr){
       arr[0] =98;
    }
    static void tellJoke(){
        System.out.println("I am Harry \t I invented a new world \n plagiarism ");
    }
    public static void main(String[] args) {
        // --------------------------jokes-----------------
       // tellJoke();


//      case 1: Changing the Integer.
//        int x=54;
//        change(x);
//        System.out.println("The value of x after running change is : "+ x);

//        case 2: Changing the Array.
        //----------------------array---------------------
        int [] marks={ 67,78,89,98,65,76};
        change2(marks);
        System.out.println("The value of x after running change is : "+ marks[0]); //98
    }
}

