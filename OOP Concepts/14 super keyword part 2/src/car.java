public class car extends vehicle {

    String Name;
    car(String c, Double w,String n) {
        super(c, w);
        Name=n;
        
    }
    void detail()
    {
        super.detail();
        System.out.println("Name is: "+Name);
    }
    
}
