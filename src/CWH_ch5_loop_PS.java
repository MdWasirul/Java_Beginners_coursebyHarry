public class CWH_ch5_loop_PS {
    public static void main(String[] args) {

        System.out.println("Chapter 5 Practice Set  loop Question ");
        //Question 1. pattern print
        int n=4;
        for (int i=n;i>0;i--)
        {
            for (int j=0;j<i;j++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }



//        //---------------------sum of  n Even Number-------
//   //Question Number 2.------------------
//        int sum=0;
//        int n=4;
//        for (int i=0;i<n;i++)    { //0,2,4,6=12
//          sum=sum+2*i;
////       System.out.println(2*i);
//        }
//        System.out.println("Sum of first 4 Even Number is :"+sum);
//        //using while loop
//        int i=0;
//        int sum1=0;
//        while(i<=3){
//            sum1=sum1+2*i;
//            i++;
//        }
//        System.out.println("sum is : "+sum1);



//        -----------Question 3---------------------------------------------;
//        System.out.println("Print Multiplication Table...........");
//        int n=2;
//        for (int i=1;i<=10;i++){
////            System.out.println(n*i);
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }
//        System.out.println("    ");


//        //question 4.
//        System.out.println("Multiplication table of 10 in reverse order .");
//        int m=10;
//        for (int i = 10; i >= 1; i--) {
//            System.out.printf("%d X %d = %d \n ", m, i, m * i);
//        }


        //question 5--
//        write the factorial program--

//        int i;
//        int num=5;
//        int fact=1;
//        for (i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.println("The Factorial of "+num+ " is : "+ fact); //   -->120

//  -----------------Question 6.---------------...................
        //_____Using while loop----------
//        int num=5;
//        int i=1;
//        int factorial=1;
//        while(i<=num){
////            factorial =factorial *i;
//            factorial *=i;
//            i++;
//        }
//        System.out.println("Factorial is : "+ factorial);


        //Question 7.-----.........
//     pattern printing --------------from while loop

//        int n=4;
//        int i=n;
//        while(i>0){
//            int j=0;
//            while (j<i){
//                System.out.print("*  ");
//                j++;
//            }
//            System.out.println("  ");
//            i--;
//        }
        //-------------Question 9.............
//        int num=8;
//        int sum=0;
//        for (int i=1;i<=10;i++){  // goes from i= 1 to i=10.
//            System.out.printf("%d X %d = %d \n",num,i,num*i);
//            sum=(sum+(num*i));
//        }
//        System.out.println("Sum of table is :  "+ sum);

        //Question 10.
        //----------------Do While Loop----------.
//        int i=0;
//        do {
//            System.out.println("I am Executing atleast once");
//            i++;
//        }while (i<2); //at least once in a false condition  like as while(false).


        //Question 11.--------
//        int sum=0;
//        int n=4;
//        for (int i=0;i<n;i++)    { //0,2,4,6=12
//          sum=sum+2*i;    //12
////       System.out.println(2*i);
//        }
//        System.out.println("Sum of first 4 Even Number is :"+sum);

    }
}




