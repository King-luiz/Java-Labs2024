public class Cylinder extends Circle {

    //attributes
    double height;

    //default constructor
    public Cylinder() {
        super();
        height = 1.0;
    }
    
    //constructor with default radius and color but given height.
    public Cylinder(double height) {
        super();
        height = 1.0;
         
    }
    public Cylinder(double radius ,double height){
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius,color);
        this.height = height;
    }
    
    //getters and setters
    public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    
    //calculate volume
    public double getVolume() {
        return getArea() * height;
    }

    //toString method
    public String toString() {
        return "Cylinder [Radius = " + radius + ", Color = " + color + ", Height = " + height + "]";
    }

    //main method

    public static void main(String[] args) {


        System.out.println("============Cylinder 1==================");
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: " + c1);
        System.out.printf("Volume of cylinder1: %.2f%n ", c1.getVolume());
        System.out.printf("Base area: %.2f%n ",c1.getArea());
        System.out.println("                                      ");
        
        System.out.println("============Cylinder 2==================");
        Cylinder c2 = new Cylinder(5, 10,"blue");
        System.out.println("Cylinder 2: " + c2);
        System.out.printf("Volume of cylinder2: %.2f%n ", c2.getVolume());
        System.out.printf("Base area: %.2f%n ",c2.getArea());
        System.out.println("                                           ");


        //test for getters and setters
        System.out.println("============Test for getters and setters=================");
        c2.setHeight(20);
        System.out.println("Cylinder 2 after modification: " + c2);
        System.out.println("                                      ");

        //test for toString method
        System.out.println("============Test for toString==================");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("                                      ");

        //test for Circle methods
        System.out.println("============Test for Circle Methods==================");
        System.out.println("                                      ");
        System.out.printf("Area of cylinder1: %.2f%n ", c1.getArea());
        System.out.printf("Circumference of cylinder1:  %.2f%n", c1.getCircumference());

    }
}
 