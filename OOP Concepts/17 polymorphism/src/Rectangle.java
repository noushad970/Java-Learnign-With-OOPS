public class Rectangle extends shape{
   double height,width;
   
    Rectangle(double height,double width)
    {
        this.height =   height;
        this.width=width;
    }
    double Area()
    {
        return height*height;
    }
}
