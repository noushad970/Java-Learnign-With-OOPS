public class box {
    double height,weight,depth;
    box(double height,double weight,double depth)
    {
        this.height=height;
        this.weight=weight;
        this.depth=depth;
    }
    void displayVol()
    {
        double vol=height*weight*depth;
        System.out.println("The volume is : "+vol);
    }

}
