public class Student {

    String name;
    int age,id;
    static String UniName="Patuakhali University of Information and Technology";
    static int NumberOfSt=0;

    Student(String n,int a,int i)
    {   
        name=n;
        age=a;
        id=i;
       NumberOfSt++;

    }
    void showStNumber()
    {
        System.out.println("Number of Student: "+NumberOfSt);
    }
    void displayInfo()
    {
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student ID: "+id);
        System.out.println("Student University name: "+UniName);
    }
    
}
