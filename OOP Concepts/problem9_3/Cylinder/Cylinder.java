public class Cylinder{
    
    private double height;
    private double width;
   
    void setHeight(double height){
        this.height=height;
    }
    double getHeight()
    {
        return this.height;
    }
    void setWidth(double width){
        this.width=width;
    }
    double getWidth()
    {
        return this.width;
    }
    void Area()
    {
        double area=3.14159*height*width;
        System.out.println("Area of Cylinder is "+area);
    }

}