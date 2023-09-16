public class Triangle extends shape{
    double height,width;
   
    Triangle(double height,double width)
    {
        this.height =height;
        this.width=width;
    }
    double Area()
    {
        return .5*height*width;
    }
}
