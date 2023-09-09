public class Private_Person {
    private String name;
    private int age;
    int getAge()
    {
        return age;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void dis()
    {
        System.out.println(getName());
        System.out.println(getAge());
    }
}
