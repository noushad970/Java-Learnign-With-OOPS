public class person {
    final String Uni_name="PSTU";
    final int fees;
    String Std_Name;
    static final int age;
    static{
        age=10;
    }
    person()
    {
        fees=3000;
    }
    final void display()

    {
        
        System.out.println("Student name: "+Std_Name);
        System.out.println("University name: "+Uni_name);
        System.out.println("University fees: "+fees);
    }

}
