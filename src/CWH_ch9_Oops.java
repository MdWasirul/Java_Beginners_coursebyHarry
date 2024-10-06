

class myEmployee{
   private int id;
    private String name;


    public String getName(){
        return name;
    }
    public void setName(String n){
      this. name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

}

public class CWH_ch9_Oops {
    public static void main(String[] args) {
       myEmployee harry =new myEmployee();
//       harry.id=12;
//       harry.name="CodeWithHarry"; -----show error due private access modifiers
        harry.setId(35);
//        harry.getId();
        System.out.println(harry.getId());
        harry.setName("Hello I am pursuing BCA from Osmania University ");
        System.out.println(harry.getName());
//        harry.getName();
    }
}
