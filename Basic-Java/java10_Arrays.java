import java.util.Scanner;

public class java10_Arrays {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      //1d array
     int []arr={1,2,3,4,2,1,12,312};
     
     for (int i : arr) {
        System.out.println(i);
     }
     
    //2d array
    int [][] arr1={{1,3,4},{3,4,6},{12,3,45}};
    System.out.println("\n"+arr1[2][2]);
     //string array
    String [] Car={"Ford","Lamborgini","Tesla","Formula 1","BMW","Marcedes"};
    for(String i: Car)
    {
        System.out.println(i);
    }

}
    

    
}
