public class java04_operators {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
       //arithmatic operators
       int a=100,b=201;
       int c=a+b;
       int d=b-a;
       int e=a*b;
       int f=b/a;
       int g=b%a;
       System.out.println("The summation of a and b is : "+c);
       System.out.println("The subtruction of a and b is : "+d);
       System.out.println("The multiplication of a and b is : "+e);
       System.out.println("The division of a and b is : "+f);
       System.out.println("The modulation of a and b is : "+g);

       //assignment operators
        int num1=100;
        System.out.println(num1);
        num1+=12;
        System.out.println(num1);

        num1=122;
        System.out.println(num1);
        //increment decrement
        
        System.out.println("num1++ = "+num1++);
        System.out.println("--num1 = "+ ++num1);
        System.out.println("num1-- = "+num1--);
        System.out.println("--num1 = "+ --num1);

        //comparison operator
        /*
         == return true if two values are equal
         != return true if two values are not equal
         > return true if one value is bigger than another
         < return true if on value is smaller than another
         >= return true if on value is bigger equal than another
         <= return true if on value is smaller equal than another

         */

         //logical operator
        /*
         && operator : if both condition are true
         || operator : if one of them is true
         ! operator : if true return false and if false return true
         */
        



    }
    
}
