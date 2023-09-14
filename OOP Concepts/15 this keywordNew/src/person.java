public class person {
    int age;
    String name;
    String hairCol;
    person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    person(String name,int age,String hairCol)
    {
        this(name, age);
        this.hairCol=hairCol;
    }
    void display()
    {   
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hair Color: "+hairCol);
    }
}
