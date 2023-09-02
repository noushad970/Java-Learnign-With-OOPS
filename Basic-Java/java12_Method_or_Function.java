import java.util.Scanner;

public class java12_Method_or_Function {

    static int sum(int a ,int b)
    {
        return a+b;
    }
    static int sub(int a ,int b)
    {
        return a-b;
    }
    static int mul(int a ,int b)
    {
        return a*b;
    }
    static int div(int a ,int b)
    {
        return a/b;
    }
    static int mod(int a ,int b)
    {
        return a%b;
    }
    static void max(int a,int b)
    {
        if(a>b)
        System.out.println("first number is large");

        else if(a<b)
        System.out.println("Second Number is Large");
        else
        System.out.println("Both are Equal");
        
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     int x=sum(12, 12);
        System.out.println("The summation is: "+x);
        int a=sub(12, 2);
        System.out.println("The subtraction is: "+a);
        int b=mul(12, 12);
        System.out.println("The multiplication is: "+b);
        int c=div(12, 12);
        System.out.println("The division is: "+c);
        int d=mod(12, 12);
        System.out.println("The modulas is: "+d);
        max(12, 34);
}
    

    
}
