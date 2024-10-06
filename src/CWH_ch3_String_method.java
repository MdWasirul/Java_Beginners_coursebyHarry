public class CWH_ch3_String_method {
    public static void main(String[] args) {
        String a  ="wasirul";
        String b=  new String("WASIRUL");  //
        System.out.println(a+"   "+b);
        int value=a.length();
        System.out.println(value);  //return string  length i.e.7;

        //--------
//        String lstring = b.toLowerCase();
//        System.out.println(lstring);

        //------upper case --
//        String upstring = a.toUpperCase();
//        System.out.println(upstring);

        //---------trim()  -method
//        String nonTrimstring="      harry       ";
//        System.out.println(nonTrimstring);

//        String trimstring=nonTrimstring.trim();
//        System.out.println(trimstring);

        /*-------------substring(int start ) ---
        return a substring from start  to the end;
         note : index always start with 0   -; */
        String sabstring=b.substring(4);
        System.out.println(sabstring);
// --substring(int startIndex ,int endIndex);
        String sbtring_2=b.substring(2,6);
        System.out.println(sbtring_2);

        ///-------String replace method -----
        String name="Harry";
        String repstring=name.replace('r','p');
        System.out.println(repstring); //Happy
        System.out.println(name.replace("arr","ear"));   //replace  string character target--->replacement


        //--------------return boolean--->True or False
        System.out.println(name.startsWith("Har"));  //return --.TRUE;
        System.out.println(name.endsWith("ary")); //return -->false;
        System.out.println(name.charAt(3));
        //----------indexof() -->method return the index of the given string ;

        String modifiedname="Harryarry";
        System.out.println(modifiedname.indexOf("rry")); //return --(2)

        System.out.println(modifiedname.indexOf("rry", 3)); //return (6)
        //-------------last index return;-- ----------
        System.out.println(name.lastIndexOf("r"));  //return index --(3)

        System.out.println(modifiedname.lastIndexOf("r")); //return index (7).
        // lastIndex of ("r",2)----->Returns the last index of thr given string before index 2
        System.out.println(modifiedname.lastIndexOf("r",4)); //return index (3)
        //----equals ()--->string method
        // return true if the given String is equal to Harryarry   otherwise False [Case Sensitives]
        System.out.println(modifiedname.equals("Harry"));  //return False
        System.out.println(modifiedname.equals("Harryarry"));  //return TRUE



        /*  equalsIgnoreCase()  :method-->return true if two String are equals ignoring the case of characters.*/
        System.out.println(modifiedname.equalsIgnoreCase("harrYaRRy"));//return True  //Case would not be considered;

       /* Escae sequence of charater -->Sequence of character after backslash '\' =Escape sequence of characters.
       \n, \t , \\ etc  */
        System.out.println("HI am a Fronted Developer \n double sequence Charcter ");










    }
}
