public class B extends A {
    int x=20;
    void display()
    {
        System.out.println("Value of Normal keyword x in class B: "+x);
    }
    void displaySuper()
    {
        System.out.println("Value of super keyword x in class B: "+super.x);
    }
    void text1(){
        super.text1();
        System.out.println("This is B class");
    }
}
