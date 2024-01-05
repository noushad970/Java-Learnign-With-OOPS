

public class multithread{
    public static void main(String[] args)
    {
        thousandLoops t1= new thousandLoops();
        HundradLoops t2= new HundradLoops();
        tenLoops t3= new tenLoops();
        oneLoops t4= new oneLoops();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}