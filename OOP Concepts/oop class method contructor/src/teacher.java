public class teacher {
    
        String name,gender;
        int number;
        int age;
        

        //peremeterized method
        void setInfo(String m,String n,int o,int ag)
        {
            name=m;
            gender=n;
            number=o;
            age=ag;

        }
        //non peremeterize method
    void DisplayInformation()
    {
        System.out.println("Name: "+name);
       System.out.println("Gender: "+gender);
       System.out.println("Age: "+age);
       System.out.println("Number: "+number)  ;
    }
}
