public interface GeometricObjects {
    //attributes
    double getPerimeter();
    double getArea();
    
}

public class Circle implements GeometricObjects {
    protected double radius;
    
    //methods
    public Circle (double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2* Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //toString
    public String toString(){
        return  "Circle [ radius" ]"
    }
    

    
    
}

