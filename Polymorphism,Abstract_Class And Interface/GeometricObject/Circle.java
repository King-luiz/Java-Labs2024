// Implement the Circle class
public class Circle implements GeometricObject {
    //variables
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    // main class
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle: " + circle);
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());
    }
}