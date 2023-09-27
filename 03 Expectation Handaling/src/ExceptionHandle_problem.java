import java.util.Scanner;

public class ExceptionHandle_problem {
    public static void main(String[] args) {
        while(true)
        {
            try{
                int a,b;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter num1: ");
            a= s.nextInt();
            System.out.println("Enter num2: ");
            b= s.nextInt();
            int x=a/b;
            System.out.println("Result: "+x);
            break;
            }
            catch(Exception e)
            {
                System.out.println("Error: "+e);
            }
            finally{
                System.out.println("Program finished");
            }
        }

    }
}
