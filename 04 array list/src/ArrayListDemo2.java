import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList <Integer> ar= new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        //contain is for the integer is present in the arraylist or not
        boolean b= ar.contains(40);
        System.out.println(b);
        int x= ar.indexOf(40);
        System.out.println("Index of the value 40 is "+x);
    }
}
