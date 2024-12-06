
// Implement the Rectangle class
class Rectangle implements GeometricObject {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
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
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }

    //main class
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle: " + rectangle);
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());
    
        }
}