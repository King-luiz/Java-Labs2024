// Abstract Class Shape
public abstract class Shape {
   
    protected String color;
    protected boolean filled;

    //defaults constructors
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    //parametric constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

    //main class
    public static void main(String[] args) {
        //test for abstract methods
        //Shape shape = new Shape();
        //System.out.printf("Shape: " + shape);
        //System.out.printf("Area: %.2f%n", shape.getArea());
        //System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());

        //test for rectangle
        Shape shape2 = new Rectangle(5.0, 10.0);
        System.out.printf("Shape 2: " + shape2);
        System.out.printf("Area: %.2f%n", shape2.getArea());
        System.out.printf("Perimeter: %.2f%n", shape2.getPerimeter());
        System.out.printf("Color: " + shape2.getColor());
        System.out.printf("Filled: " + shape2.isFilled());

        //test for circle       
         Shape shape3 = new Circle(3.0);
        System.out.printf("Shape 3: " + shape3);
        System.out.printf("Area: %.2f%n", shape3.getArea());
        System.out.printf("Perimeter: %.2f%n", shape3.getPerimeter());
        System.out.printf("Color: " + shape3.getColor());
        System.out.printf("Filled: " + shape3.isFilled());

        //test for square shape 
        Shape shape4 = new Square(4.0);
        System.out.printf("Shape 4: " + shape4);
        System.out.printf("Area: %.2f%n", shape4.getArea());
        System.out.printf("Perimeter: %.2f%n", shape4.getPerimeter());
        System.out.printf("Color: " + shape4.getColor());
        System.out.printf("Filled: " + shape4.isFilled());

    
    }
}