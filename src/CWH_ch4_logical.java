public class CWH_ch4_logical {
    public static void main(String[] args) {
        System.out.println("Logical AND operator ");
        boolean a=true;
        boolean b=true;
        if (a&&b)
        {
            System.out.println(" Yes");
        }
         else {
            System.out.println("NO"); //executes when condition does not meet;
             }

        System.out.println("Logical OR operator ");
        boolean p=false;
        boolean q=true;
        if (p||q)
        {
            System.out.println(" Yes");
        }
        else {
            System.out.println("NO"); //executes when condition does not meet;
        }
         System.out.println("Logical NOT!........");
         System.out.println("For Logical A!");
         System.out.println(!p);
         System.out.println("For Logical b!");
         System.out.println(!q);
    }

}
