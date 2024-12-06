public class Circle {
    //attributes
    double radius;
    String color;

    //default constructors
    public Circle() {
     radius = 1.0;
     color = "red";
        
    }

    //parametric constructors
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getters and setters
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor) {
        color = newColor;
    }

    //calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
    //toString method
    public String toString() {
        return "Circle [Radius = " + radius + ", Color = " + color + "]";
    }

    //main method
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        
        Circle circle2 = new Circle(5, "blue");
        System.out.println("Circle 2: " + circle2);

        System.out.printf("Area of circle1: %.2f%n ", circle1.getArea());
        System.out.printf("Circumference of circle1:  %.2f%n", circle1.getCircumference());

        System.out.printf("Area of circle2: %.2f%n", circle2.getArea());
        System.out.printf("Circumference of circle2:  %.2f%n", circle2.getCircumference());

        //test for getters and setters
        circle2.setRadius(10);
        circle2.setColor("green");
        System.out.println("Circle 2 after modification: " + circle2);

        //test for toString method
        System.out.println(circle1);
        System.out.println(circle2);

    }

}
