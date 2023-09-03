public class Method {
    public static void main(String[] arg)
    {
        teacher teacher1=new teacher();
        teacher1.name="Noushad";
        teacher1.gender="Male";
        teacher1.age=24;
        teacher1.number=1745002121;
        teacher1.DisplayInformation();
        System.out.println();
        teacher teacher2=new teacher();
        teacher2.name="Faruk";
        teacher2.gender="Male";
        teacher2.age=22;
        teacher2.number=1742131120;
        teacher2.DisplayInformation();
        //peremeter method
        System.out.println();
        teacher t3 = new teacher();
        t3.setInfo("Yeasin", "Male", 17232434,23);
        t3.DisplayInformation();
    }
}
