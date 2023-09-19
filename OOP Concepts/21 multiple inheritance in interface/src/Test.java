import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int d1=s1.nextInt();
        int d2 = s1.nextInt();
        if(d1>0 && d2>0)
        {
            System.out.println(d1*d2);
        }
        else 
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
