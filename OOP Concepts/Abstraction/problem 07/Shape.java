abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Area[] rectangles = new Area[4];

        Area[] squares = new Area[4];

        Area[] circles = new Area[5];

        for (int i = 0; i < 4; i++) {
            rectangles[i] = new Area();
            squares[i] = new Area();
        }
        for (int i = 0; i < 5; i++) {
            circles[i] = new Area();
        }

        System.out.println("Areas of Rectangles:");
        for (int i = 0; i < 4; i++) {
            rectangles[i].RectangleArea(5.0, 8.0);
        }

        System.out.println("\nAreas of Squares:");
        for (int i = 0; i < 4; i++) {
            squares[i].SquareArea(4.5);
        }

        System.out.println("\nAreas of Circles:");
        for (int i = 0; i < 5; i++) {
            circles[i].CircleArea(3.0);
        }
    }
}
