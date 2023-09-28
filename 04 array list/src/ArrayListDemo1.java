import java.util.*;

import javax.sql.XADataSource;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <Integer> AL= new ArrayList<>();
        //System.out.println(AL);
        int x;
        Scanner s= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            x=s.nextInt();
            AL.add(x);
        }
        System.out.println(AL.size());
        AL.clear();
        System.out.println(AL.size());
        AL.removeAll(AL);
        System.out.println(AL.size());
        
    }
}
