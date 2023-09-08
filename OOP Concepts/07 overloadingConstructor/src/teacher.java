public class teacher {
    String name,gender;
    int age,num;
    teacher(){
        System.out.println("No value added here");
    }
    teacher(String n,String g){
        name=n;
        gender=g;

    }
    teacher(String na,String ge,int ag)
    {
        name=na;
        gender=ge;
        age=ag;
    }
    teacher(String nam,String gen,int ag1,int nu)
    {
        name=nam;
        gender=gen;
        age=ag1;
        num=nu;
    }
    void displayInfo()
    {
        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Age is: "+age);
        System.out.println("Phone Number is: "+num);
    }
    
}
