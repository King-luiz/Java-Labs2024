
// Class Square extending Rectangle
class Square extends Rectangle {

    //default constructor
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

    //main class
    public static void main(String[] args) {
        //test for constructor
        Square square = new Square(5.0);
        System.out.println("Square: " + square);
        System.out.printf("Area: %.2f%n", square.getArea());
        System.out.printf("Perimeter: %.2f%n", square.getPerimeter());

        //test for getters and setters
        square.setSide(7.0);
        System.out.println("Square after modification: " + square);
        System.out.println(square);

        //test for toString method
        Square square2 = new Square(3.0, "blue", true);
        System.out.println("Square 2: " + square2);
        System.out.printf("Area: %.2f%n", square2.getArea());
        System.out.printf("Perimeter: %.2f%n", square2.getPerimeter());
        System.out.println("Color: " + square2.getColor());
        System.out.println("Filled: " + square2.isFilled());
    
    }
}