import java.util.Scanner;

public class java11_try_catch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     //try catch is a method by which we can ignore an error on the program and execute the program with the error
     int []a={1,3,4,5};
     try{
        System.out.println(a[6]);
     }   
     catch(Exception e)
     {
        System.out.println(e);
     }
     System.out.println("My name is Noushad");

}
    

    
}
