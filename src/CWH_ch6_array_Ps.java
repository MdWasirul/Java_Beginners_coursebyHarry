public class CWH_ch6_array_Ps {
    public static void main(String[] args) {

        //Question 1.

        // Create an array of 5 floats and calculate Sum.
        /*
      float  sum=0;
        float [] marks= new float[5];
        marks[0] =78.5f;
        marks[1] =56.5f;
        marks[2] =67.5f;
        marks[3] =89.5f;
        marks[4] =78.8f;
//        for (int i=0;i< marks.length;i++){
//            sum=sum+marks[i];
////            System.out.println(sum);//370.8;
//        }
//        System.out.println("Sum of Marks is : "+ sum);

        //---------Using ------------for Each loop----
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("Sum of Element is : " +sum);

         */

//        Question NUmber 2.
//check a number is present or not in an array--
//                float [] marks={78.5f,89.5f,67.7f,45.0f,45.5f};
//                float num=45.5f;
//                boolean isArray=false;
//                for (float element:marks){
//                    if (num==element){
//                        isArray=true;
//                    }
//                }
//
//                if (isArray){
//                    System.out.println("The NUmber is present in an  array: ");
//
//                }else {
//                    System.out.println("The number is Not present in an array.............................");
//                }
        //Question -03.
//
//        float [] marks={78.5f,89.5f,67.7f,45.0f,45.5f};
//        float sum=0;
//        float avg;
//        for (float element:marks){
//            sum=sum+element;
//
//        }
//        avg=sum/5.0f;
//        System.out.println(avg);

        // Practice Question -04.
//        int [][] mat1={{1,2,3},
//                       {4,5,6}};
//        int [][] mat2={{7,8,9},
//                        {1,2,3}};
//        int [][] result={{0,0,0},
//                          {0,0,0}};
//        for (int i=0;i<mat1.length;i++){ //row  number of times;
//            for (int j=0;j<mat1[i].length;j++){ //column number of times.
//                System.out.format("Setting the value for i=%d and j=%d \n",i,j);
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//        //printing a 2-D Array-----
//        for (int i=0;i<mat1.length;i++){ //row  number of times;
//            for (int j=0;j<mat1[i].length;j++){ //column number of times.
//                System.out.format(result[i][j]+" ") ;
////                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//            System.out.println(" ");
//        }


        //Practice Question --05
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
////        System.out.println(a);
//        for (int i=0;i<n;i++){
//
//            //swap a[i]=a[l-1-i];
//            // a  b temp
//            // |3| |4| ||;
//            // || |4| |3|;
//            // |4| || ||;
//            // |4| |3| ||;
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l - 1 - i] =temp;
//        }
//        for(int element:arr){
//            // 6,5,4,3,2,1;
//            System.out.println(element +"");
//        }


        //Practice Question 6.---
        // find maximum element from array

//        int[]arr = {1, -21, 3, -3424, 54, 66};
////        int max=0;
//        int max=Integer.MIN_VALUE; // -ve to +ve
//        for (int e: arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("Maximum element in this array is " + max);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //practice Question  .7

//        int[]arr = {12, 28, 37, 3424, 54, 66};
//        int min=2147483647;
////        int min=Integer.MAX_VALUE; // -ve to +ve
//        for (int e: arr){
//            if (e<min){
//                min=e;
//            }
//        }
//        System.out.println(" Minimum Element in this Array is " + min);

        //--------------------------------------
        //Question 8.
        boolean isSorted=true;
        int [] arr ={ 1,2,3,4,5,34,67};
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        }else {
            System.out.println("The Array is not Sorted");
        }

    }
}
