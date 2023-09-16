public class input {
    public static void main(String[] args) {
        shape s1=new shape();
        shape s2= new Triangle(20, 30);
        shape s3= new Rectangle(24, 33);
        System.out.println("Area is: "+s1.Area());
        System.out.println("Area of Triangle is: "+s2.Area());
        System.out.println("Area of Rectangle is: "+s3.Area());
        System.out.println();
        shape s=new shape();
        System.out.println("Area is: "+s.Area());
        s= new Triangle(20, 30);
        System.out.println("Area of Triangle is: "+s.Area());
        s= new Rectangle(24, 33);
        System.out.println("Area of Rectangle is: "+s.Area());
        
        
    }
}
