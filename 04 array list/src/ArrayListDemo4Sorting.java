import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> ar1= new ArrayList<>();
        
        ar1.add(30);
        ar1.add(021);
        ar1.add(1);
        ar1.add(64);
        ar1.add(23);
        ar1.add(41);
        System.out.println(ar1);
        Collections.sort(ar1);
        System.out.println(ar1);
        Collections.sort(ar1,Collections.reverseOrder());
    }
}
