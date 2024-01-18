public class Shape{
   public static void show()
    {
        System.out.println("This is a shape");
    }
    public static void getInfo()
    {
        System.out.println("this is Shape class");
    }

}
public class Circle extends Shape{
    public static void show()
    {
        System.out.println("This is a Circle");
    }
}
public class Rectangle extends Shape{
    public static void show()
    {
        System.out.println("This is a Rectangle");
    }
}
public class main{
    public static void main(String[] args)
    {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        System.out.println("This should show base class show method");
        shape.show();
        System.out.println("This should show circle class show method");
        circle.show();
        System.out.println("This should show rectangle class show method");
        rect.show();
        System.out.println("This should show base class getinfo method");
        circle.getInfo();
        System.out.println("This should show base class getinfo method");
        rect.getInfo();
    }
}