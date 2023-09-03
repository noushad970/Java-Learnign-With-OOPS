public class contructorClass{
    String name,gender;
        int number;
        int age;
        //constructor=same as method but the class name and the contructor name is always same
        contructorClass(String n,String g,int num,int a)
        {
            name=n;
            gender=g;
            number=num;
            age=a;
        }
        contructorClass(){
            System.out.println("No value added");
        }
        contructorClass(String x,String y,int z)
        {
            name=x;
            gender=y;
            age=z;
        }
        void displayInfo(){
            System.out.println("Name: "+name);
       System.out.println("Gender: "+gender);
       System.out.println("Age: "+age);
       System.out.println("Number: "+number)  ;
        }

}