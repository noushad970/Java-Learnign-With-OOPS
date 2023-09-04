public class test1 {
    
    public static void main(String[] args) {
        Student s1=new Student("Noushad", 21, 2102038);
        s1.displayInfo();
        System.out.println();
        System.out.println("Static variable: "+Student.UniName);
        System.out.println();
        s1.showStNumber();
        Student s2=new Student("Nahid", 21, 2102039);
        s2.showStNumber();
        Student s3=new Student("Rana", 21, 2102040);
        s3.showStNumber();
    }
    
}
