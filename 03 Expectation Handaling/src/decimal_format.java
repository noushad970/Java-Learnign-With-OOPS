import java.text.DecimalFormat;

public class decimal_format {
    
    public static void main(String[] args) {
        double d=100.11212132;
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println(df.format(d));
        DecimalFormat d2= new DecimalFormat("0.000");
        System.out.println(d2.format(d));
        
    }
}
