public class private_Teacher extends Private_Person{
    private int id;
    int getId()
    {
        return id;
    }
    void setId(int id)
    {
        this.id=id;
    }
    void displayInfo()
    {
        dis();
        System.out.println(getId());
    }
    
}
