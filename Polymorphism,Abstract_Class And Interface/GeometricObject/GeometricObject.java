// Define the GeometricObject interface
interface GeometricObject {
    double getArea();
    double getPerimeter();

    //main class
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        
        // Print the area and perimeter of each object
        System.out.println("Circle: " + circle);
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());

        System.out.println("\nRectangle: " + rectangle);
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());

        
    }
}