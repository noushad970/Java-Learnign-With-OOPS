public class Test {
    public static void main(String[] arg)
    {
        teacher t1=new teacher();
        System.out.println();
        teacher t2=new teacher("Noushad","Male");
        t2.displayInfo();
        System.out.println();
        teacher t3=new teacher("Faruk","Male",22);
        t3.displayInfo();
        System.out.println();
        teacher t4=new teacher("Sohagh","Male",24,173456789);
        t4.displayInfo();
        System.out.println();
        
    }
}
