public class Contructor {
    public static void main(String[] arg)
    {
        contructorClass t1= new contructorClass("Noushad", "Male", 1798144407, 23);
        t1.displayInfo();
        System.out.println();
        contructorClass t2=new contructorClass();
        t2.displayInfo();
        System.out.println();
        contructorClass t3=new contructorClass();
        t3.displayInfo();
        System.out.println();
        contructorClass t4= new contructorClass("Nahid", "Female", 21);
        t4.displayInfo();
    }
}
