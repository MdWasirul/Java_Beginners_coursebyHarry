public class CWH_ch5_loop_4 {
    public static void main(String[] args) {
        //------------------------------Break and Continue Statement-----
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            System.out.println("java is great ");
            if (i == 2) {
                System.out.println("Ending the loop");
                break; //exiting the loop and control is sent outside the loop.

            }
        }
            System.out.println("Loop ends Here");
                    //-----------Continue statement -------
                for(int i=7;i>0;i--){
                    if(i==3){
                        continue;//continue skips the rest statement
                             //it skip everything below "continue " inside the loop for that iteration .
                    }
                    System.out.println(i); //  7,6,5,4,2,1
                }

    }
}
