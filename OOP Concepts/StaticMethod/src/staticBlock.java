//static block is a block by which we can access static method or initialize static method
//we also use it as main method but it will not be a main method.for example if we want to
//print something in the static block we can do it.
public class staticBlock {

    static int x,y;
    static{
        x=10;
        y=20;
        System.out.println("This is a static block");
    }

    static void display(){
        System.out.println("The value of x: "+x);
        System.out.println("The value of y: "+y);
    }
    public static void main(String[] args) {
        staticBlock.display();
    }
    
}
