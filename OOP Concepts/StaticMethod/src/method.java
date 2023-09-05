public class method {
    public static void main(String[] args) {
        staticMethod st=new staticMethod();
        st.nonStatic();
        //we need a create an object to access a none static method
        staticMethod.staticMeth();
        //we dont need to create a object to access a static method
    }
}
