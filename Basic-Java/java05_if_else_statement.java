import java.util.Scanner;

public class java05_if_else_statement {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
       // inputting a striing
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name= scan.nextLine();
       //inputting a int
       Scanner scan2= new Scanner(System.in);
       System.out.println("Enter Your Age");
       int age=scan2.nextInt();
       //inputting a float;
       Scanner scan3= new Scanner(System.in);
       System.out.println("Enter Your Salary: ");
       float salary =scan3.nextFloat();
       System.out.println("The detail of myself si below:");
       System.out.println("Age is: "+age);
       System.out.println("Name is : "+name);
       System.out.println(salary);

       //if else condition
       Scanner scan5=new Scanner(System.in);
       System.out.println("Enter your age:");
       int age1=scan5.nextInt();
       if(age1<5)
       System.out.println("You are a child");
       else if(age1<18 && age1>=5)
       System.out.println("You are a kid");
       else if(age1<27 && age1>=18)
       System.out.println("You are a Man");
       else
       System.out.println("You are a old man");
        
       



    }
    
}
