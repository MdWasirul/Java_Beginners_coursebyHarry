public class CWH_ch3_String_ps {
    public static void main(String[] args) {
        /*PS question-1.
        convert a String to lower Case;

         */
        String name="HiHarRy";
        name=name.toLowerCase();
        System.out.println(name);

        // problem--2
        String text="Hi Am Harry";
        text=text.replace(' ','_');
        System.out.println(text);
         //Problem no -03
       String letter="Dear <|name|>, Thanks a lot ";
       letter=letter.replace("<|name|>" ,"Harry Sachin");
        System.out.println(letter);

        //problem 4
        //any one of  the value becomes -1 then double  of tripple space is not presented there;
        String txt="This string contains double   and triple spaces ";
        System.out.println(txt.indexOf("  ")); //27
        System.out.println(txt.indexOf("   ")); //27
      //Escape sequence character..
//        problem no 5
      String  myLetter ="Dear Harry,\n\tThis Java Course is nice.\n\tThanks. ";
        System.out.println(myLetter);

    }
}
