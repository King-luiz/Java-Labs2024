public class CircleY{
    //ATTRIBUTES
    double radius;
    String color;

    //default constructor
public CircleY (){
radius = 1.0;
color = "red";
}

    //parameterized constructor
    public CircleY(double r, String c){
        radius = r;
        color = c;
    }
    //getters
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    //setters
    public void setRadius(double Radius) {
        radius = Radius;
    }
    public void setColor(String Color) {
            color = Color;
        }
        //toString
        public String toString(){
            return "CircleY [Radius = " + radius + ", Color = " + color + "]";
        }
        //calculate area
        public double getArea(){
            return radius * radius * Math.PI;
        }
        //calculate circumference
        public double getCircumference(){
            return 2 * Math.PI * radius;
        }

        //MAIN CLASS
        public static void main(String[]args){

            System.out.println("=========AREA AND CIRCUMFERENCE===============");
            System.out.println("                                                   ");
            //testing the method
            System.out.println("================DEFAULT CIRCLE================");
            System.out.println("                                                 ");
            CircleY c1 =new CircleY();
            System.out.println("radius is : " + c1.getRadius() + "color is : " + c1.getColor());
            System.out.printf(" area :%.2f%n", c1.getArea());
            System.out.printf("circumference : %.2f%n", c1.getCircumference());

            System.out.println("                                                 ");
            System.out.println("==========INITIAL CIRCLE=================");
            System.out.println("                                                 ");

            CircleY c2 = new CircleY(7.0, "blue");
            System.out.println("radius is : " + c2.getRadius() + "color is : " + c2.getColor());
            System.out.printf("area : %.2f%n", c2.getArea());
            System.out.printf("circumference : %.2f%n", c2.getCircumference());


            System.out.println("                                                 ");
            System.out.println("=================CURRENT CIRCLE=======================");
             System.out.println("                                                 ");

            CircleY c3 = new CircleY();
            System.out.println("Radius is : " + c3.getRadius() + "color is : " + c3.getColor());
            System.out.printf("area : %.2f%n", c3.getArea());
            System.out.printf("circumference :%.2f%n", c3.getCircumference());
        }

}
