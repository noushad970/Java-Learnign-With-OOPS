

public class t1 {
    public static void main(String[] args) {
       
        //a final keyword is use to make a variable constant and we can initialize value of a variable directly 
        //in the class or we can initial them with in a constructor
        //and for a static final keyword we cannot directly initialize them .for initialize a static final variable
        //we need to add a static block and then we have initial the variable inside the block.
        student p1=new student();
        p1.display2();
        p1.Std_Name="Noushad";
        System.out.println();
        p1.display2();
        p1.id=2102038;
        System.out.println();
        p1.display2();
        
    }
}
