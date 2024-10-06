
//------------------INHERITANCE IN INTERFACES .----------------------||
interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
   public void meth1(){
       System.out.println("This method 1");
   }
  public void meth2(){
      System.out.println("This method 2");
  }
  public void meth3(){
      System.out.println("This method 3");
  }

   public void meth4(){
       System.out.println("This method 4");
    }
}


public class CWH_ch11_interface_58 {
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
