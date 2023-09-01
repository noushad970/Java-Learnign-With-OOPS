import java.util.Scanner;

public class java09_loops {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        int x=0;
      //while loops
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the number");
      int i=scan.nextInt();
        // while(x<i)
        // {
        //     System.out.println(x);
        //     x++;
        // }
        // System.out.println("\n");
    //do while loops
    do{
        System.out.println(x);
        x++;
    }while(x<i);
    System.out.println("\n");
    //for loop
    for(int j=0;j<100;j++)
    {
        if(j<=10)
        continue;
        if(j==20)
        break;
        System.out.println(j);
        
    }
    
    }
    
}
