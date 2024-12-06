public class Circle{

    // attributes
    double radius;
    String color;

    //default constractors

    public Circle(){
        double radius = 1.0;
        String color = "red";
    }
    //parametric contractors

    public Circle(double r, String c){
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

    //setter
    public void setRadius( double newRadius){
        radius = newRadius;
    }

    public void setColor(String newColor){
        color = newColor;
    }
    
    public double getArea(){
        return radius *radius* Math.PI;
    }

    //toString

    public String toString(){
        return "Circle [ Radius = " + radius + "Color = " + color +  "]";
    }

}