import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        double sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Pizza you want to order:");
        int n=s.nextInt();
        int a[]=new int[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the size of pizza:\nPress 1 for small pizza\nPress 2 for medium pizza\nPress 3 for large pizza");
            double size=s.nextDouble();
            System.out.println("Enter the number of Cheese toppings: ");
            double ct=s.nextDouble();
            System.out.println("Enter the number of Papperoni toppings: ");
            double pt=s.nextDouble();
            System.out.println("Enter the number of Ham toppings: ");
            double ht=s.nextDouble();
            Pizza pz=new Pizza(size,ct,pt,ht);
            a[i]=(int)pz.CalcCost();
            //System.out.println("Pizza number "+(i+1)+" prize is "+ pz.CalcCost()+"$");
            sum+=pz.CalcCost();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Cost of pizza number "+(i+1)+" is "+a[i]+"$");
        }
        System.out.println("The total cost of "+n+" pizza's are: "+sum+"$");
    }
}