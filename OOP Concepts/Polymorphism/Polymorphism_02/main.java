public class main{
    public static void main(String[] args){
     SubClass test1 = new SubClass(12,34);
     System.out.println("For 12 and 34 : "+test1.checkCondition()); 
     SubClass test2 = new SubClass(10,15);

     System.out.println("For 10 and 15 : "+test2.checkCondition());   
    }
}