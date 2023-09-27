public class exception_Handler {
   public static void main(String[] args) {
    try{
        int a=10,b=0;
        int ans= a/b;
        System.out.println("Result: "+ans);
    }
    catch(Exception e)
    {
        System.out.println("Exception: "+e);
    }
    finally
    {
        System.out.println("we live in a age of science");
    }
    
   } 
}
