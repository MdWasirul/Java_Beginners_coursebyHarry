public class CWH_ch6_array {
    public static void main(String[] args) {
        /*Classroom of  500 Student -- You hava to store marks of these 500  student
         You  hava to create 2 variables
         1. Create 500 Variables
         2. Use Arrays
         */
        //There three way to create array in java ..
        // 1.declare and memory allocation
//        int [] marks = new int[5];  //1st way

        //2. declare and then memory allocation ....
//        int [] marks;
//        marks =new int[5]; //2nd way -----

        //initialization

//         marks[0]=78;
//         marks[1]=89;
//         marks[2]=67;
//         marks[3]=45;
//         marks[4]=45;
        // marks[5]=89; // it shows error as 5 is out of bound...
        //3. declaration ,initialization ,and memory allocation --
        
        int [] marks={78,89,67,45,45}; //3rd way to declare .
        System.out.println(marks[2]);

    }
}
