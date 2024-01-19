
public class SubClass extends SuperClass {
    private int data2; 

    public SubClass(int initialData1, int initialData2) {
        super(initialData1); 
        this.data2 = initialData2;
    }
    public int getData2() {
        return data2;
    }

    public void setData2(int newData2) {
        this.data2 = newData2;
    }
    public String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True!";
        } else {
            return "Condition False!";
        }
    }
}
