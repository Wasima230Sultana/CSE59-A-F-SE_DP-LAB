
interface Shape {
    double calculatorArea();
}

// Rectangle implements Shape
class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatorArea() {
        return length * width;
    }
}

// Circle implements Shape
class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatorArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculatorArea() {
        return 0.5 * base * height;
    }
}

// AreaCalculator no longer checks shape types
 class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double area = 0 ;

        for (Shape shape : shapes) {
            area += shape.calculatorArea();
        }
        return area;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(10, 5),
                new Circle(3),
                new Triangle(6,4)
        };
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("total area : " +
                calculator.calculateTotalArea(shapes));
    }
}

