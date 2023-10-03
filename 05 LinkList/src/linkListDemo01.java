import java.util.LinkedList;

public class linkListDemo01 {
    public static void main(String[] args) {
        LinkedList <String> lst= new LinkedList<>();
        lst.add("Bangladesh");
        lst.add("America");
        lst.add("Brazil");
        lst.add("Italy");
        lst.add("Belgium");
        System.out.println(lst.get(4));
        System.out.println(lst);
        lst.addAll(lst);
        System.out.println(lst);
        lst.remove(3);
        System.out.println(lst);
        lst.removeLast();
        System.out.println(lst);
        lst.removeFirst();
        System.out.println(lst);

    }
}
