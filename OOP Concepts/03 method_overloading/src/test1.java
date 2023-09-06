public class test1 {

    public static void main(String[] args) {
        method_Overloading x=new method_Overloading();
        
        System.out.println(x.sum(1,2));
        
        System.out.println(x.sum(1,2,3));
        
        System.out.println(x.sum(1,2.1));
        
       x.sum();
    }
    
}
