public class MyCircle {
    //attributes
    MyPoint center;
    int radius;

    //default constructor
    public MyCircle() {
        center = new MyPoint(0,0);
        radius = 1;
    }
    //parametric constructor
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    //constructors with MyPoint and radius
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    //getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getters and setters
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int [] CenterXY() {
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);

    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the distance between the centers of two circles
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    // Method to return a string representation of the circle
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=(" + center.getX() + ", " + center.getY() + ")]";
    }

    //main class
    public static void main(String[] args) {
        // test for constructors
        MyCircle circle1 = new MyCircle(5, 10, 20);
        MyCircle circle2 = new MyCircle(10, 20, 30);
        System.out.println(circle1);
        System.out.println(circle2);

        // test toString
        System.out.println("Circle 1 is : " + circle1.toString());
        System.out.println("Circle 2 is : " + circle2.toString());

        // test getters and setters
        System.out.println("Circle 1 radius: " + circle1.getRadius());
        circle1.setRadius(25);
        System.out.println("Circle 1 radius after setting: " + circle1.getRadius());
        System.out.println("Circle 1 center: (" + circle1.getCenterX() + ", " + circle1.getCenterY() + ")");

        // test methods
        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 1 circumference: " + circle1.getCircumference());
        System.out.println("Distance between centers of circle1 and circle2: " + circle1.distance(circle2));
        
    }

}
