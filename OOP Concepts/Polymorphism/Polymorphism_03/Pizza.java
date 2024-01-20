public class Pizza{
    private double size;
    private double Cheese_toppings;
    private double Papperoni_toppings;
    private double Ham_toppings;
    public Pizza(double d1,double d2,double d3,double d4)
    {
        this.size=d1;
        this.Cheese_toppings=d2;
        this.Papperoni_toppings=d3;
        this.Ham_toppings=d4;
    }
    public void setSize(double size)
    {
        this.size = size;
    }    
    public double getSize()
    {
        return size;
    }
    //
    public void setCheese_toppings(double Cheese_toppings)
    {
        this.Cheese_toppings = Cheese_toppings;
    }    
    public double getCheese_toppings()
    {
        return Cheese_toppings;
    }
    //
    public void setPapperoni_toppings(double Papperoni_toppings)
    {
        this.Papperoni_toppings = Papperoni_toppings;
    }    
    public double getPapperoni_toppings()
    {
        return Papperoni_toppings;
    }
    //
    public void setHam_toppings(double Ham_toppings)
    {
        this.Ham_toppings = Ham_toppings;
    }    
    public double getHam_toppings()
    {
        return Ham_toppings;
    }
    public double CalcCost()
    {
        double cost =0;
        double sizeCost=0;
        if(size==1)
        sizeCost=10;
        if(size==2)
        sizeCost=12;
        if(size==3)
        sizeCost=14;
        cost=sizeCost+(Cheese_toppings+Ham_toppings+Papperoni_toppings)*2;
        
        System.out.println("Total cost of the pizza is: ");
        return cost; 
    }
    public void getDescription()
    {
        if(size==1)
        {
            System.out.println("The size of the pizza is small.\n there are "+Cheese_toppings+" Cheese toppings, \n"+Papperoni_toppings+" Papperoni toppings \nand "+Ham_toppings+ " Ham toppings");
        }
        if(size==2)
        {
            System.out.println("The size of the pizza is medium.\n there are "+Cheese_toppings+" Cheese toppings, \n"+Papperoni_toppings+" Papperoni toppings \nand "+Ham_toppings+ " Ham toppings");
        }
        if(size==3)
        {
            System.out.println("The size of the pizza is large.\n there are "+Cheese_toppings+" Cheese toppings, \n"+Papperoni_toppings+" Papperoni toppings \nand "+Ham_toppings+ " Ham toppings");
          
        }
    }

}