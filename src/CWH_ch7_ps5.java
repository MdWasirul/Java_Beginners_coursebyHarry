public class CWH_ch7_ps5 {
    static void celsToFahren(double n){
        double fahrenheight= (n * 9/5 )+32;
        System.out.format("Temp in fahrenheit is %f ",fahrenheight);
    }
    public static void main(String[] args) {
        celsToFahren(37);

    }
}
