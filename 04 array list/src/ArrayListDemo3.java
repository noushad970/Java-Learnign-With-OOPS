import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList <Integer> ar1= new ArrayList<>();
        ArrayList <Integer> ar2= new ArrayList<>();
        ArrayList <Integer> ar3= new ArrayList<>();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        System.out.println("Array1: "+ar1);
        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        System.out.println("Array2: "+ar2);
        ar2.addAll(ar2);
        System.out.println("Array2: "+ar2);
        ar3.addAll(ar1);
        ar3.addAll(ar2);
        System.out.println("Array3: "+ar3);
        boolean b= ar1.equals(ar2);
        System.out.println(b);
    }
}
