public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public Complex subtract(Complex other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public void print() {
        System.out.println("(" + this.realPart + ", " + this.imaginaryPart + ")");
    }

    public static void main(String[] args) {
       
        Complex complex1 = new Complex(2.5, 3.0);
        Complex complex2 = new Complex(1.5, 2.0);

        Complex sumResult = complex1.add(complex2);
        System.out.print("Sum: ");
        sumResult.print();

        Complex subtractResult = complex1.subtract(complex2);
        System.out.print("Difference: ");
        subtractResult.print();
    }
}
