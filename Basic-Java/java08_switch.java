import java.util.Scanner;

public class java08_switch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
      
       //Switch case condition
       Scanner scan5=new Scanner(System.in);
       System.out.println("Enter your age:");
       int age1=scan5.nextInt();
       
       switch (age1) {
        case 12:
        System.out.println("You are 12 years old");    
            break;
        case 18:
        System.out.println("You are 18 years old");
        
        break;
        case 25:
        System.out.println("You are 25 years old");
        
        break;
        case 30:
        System.out.println("You are 30 years old");
        
        break;
        case 50:
        System.out.println("You are 50 years old");
        
        break;
        
        default:
        System.out.println("None of that condition is match's");
            break;
       }
        
       



    }
    
}
