public class CWH_ch6_array_2 {
    public static void main(String[] args) {
 //        int [] marks={78,89,67,45,45};
//        float [] marks={78.5f,89.5f,67.7f,45.0f,45.5f};
//        String [] students ={"harry","cde","Pawn","Aslam"};
//        System.out.println(marks[1]);
//        System.out.println(marks.length);
//        System.out.println(students.length);
//        System.out.println(students[2]);
                int [] marks1={78,89,67,45,45};
//        System.out.println(marks1.length);

        //Displaying the array (Naive way)....
        System.out.println("printing using Naive Method");
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);
        System.out.println("-----------------------------------------------------------");

        //Displaying the array with for Loop
        System.out.println("print using for loop ");
         for(int i=0; i< marks1.length;i++){
            System.out.println(marks1[i]);
        }


        //program to print the element of java in reverse order
        System.out.println("Printing in reverse order \n " );

      for (int j=marks1.length-1;j>=0;j--)
      {
          System.out.println(marks1[j]);
      }


      // for Each loop in java
        System.out.println("Print Using for-each loop ");
      for (int element:marks1)
      {
          System.out.println(element);
      }

    }
}
