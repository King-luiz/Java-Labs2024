// Class Circle extending Shape

class Circle extends Shape {
    //variables
    private double radius;

    //default constructor
    public Circle() {
        this.radius = 1.0;
    }

    //parametric constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
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
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
    //main class
    public static void main(String[] args) {
        //test for constructor
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        System.out.printf("Area: %.2f%n" , circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());

        //test for getters and setters
        circle.setColor("red");
        circle.setFilled(true);
        System.out.println("New color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
    }
}