
// Class Rectangle extending Shape
public class Rectangle extends Shape {
    //variables
    private double width = 1.0;
    private double length = 1.0;

    //default constructor
    public Rectangle() {}

    //parametric constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
    //main class
    public static void main(String[] args) {
        //test for constructor
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle: " + rectangle);
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());
        //test for getters and setters
        rectangle.setWidth(7.0);
        rectangle.setLength(12.0);
        System.out.println("Rectangle after modification: " + rectangle);

        //test for toString method
        Rectangle rectangle2 = new Rectangle(3.0, 6.0, "blue", true);
        System.out.println("Rectangle 2: " + rectangle2);
        System.out.printf("Area: %.2f%n", rectangle2.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle2.getPerimeter());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Filled: " + rectangle2.isFilled());

    }

}
