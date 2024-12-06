public class CircleDemo {
    public static void main(String[] args) {

        //testing 

        Circle c1 = new Circle(1.0, "red");
        //System.out.println(c1.toString());
        System.out.println("The radius of c1 is: " + c1.getRadius()  + "\n Color is: " + c1.getColor() + "\nThe area of the c1 is: " + c1.getArea());
        //c1.getColor("red");
        c1.getArea();
         
        Circle c2 = new Circle(2.0, "blue");
        //System.out.println(c2.toString());
        System.out.println("The radius of c2 is: " + c2.getRadius() + "\n Color is: " + c2.getColor()+ "\nThe area of c2 is: " + c2.getArea());
        //c2.getColor("blue");
        c2.getArea();

        Circle c3 = new Circle(3.1, "yellow");
            //System.out.println(c3.toString());
            System.out.println("The radius of c3 is: " + c3.getRadius() + "\n Color is: " + c3.getColor()+ "\nThe area of c2 is: " + c3.getArea());
        c3.getArea();
    }
    
}
