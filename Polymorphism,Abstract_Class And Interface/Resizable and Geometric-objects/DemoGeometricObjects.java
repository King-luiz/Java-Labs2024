public interface DemoGeometricObjects {
    //attributes
    double getPerimeter();
    double getArea();
    
}

public class Circle implements DemoGeometricObjects {
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
        return  "Circle [ radius = %.2f"+radius+"]";
    }
}

public class ResizableCircle extends Circle{
   


    //methods
    public ResizableCircle(double radius){
        super(radius);
    }
    public String resize(int percent){
        radius *=  percent / 100.0;
    }
    //toString
    public String toString(){
        return  "ResizableCircle [ Circle [radius = %.2f"+radius+"]]";
    }
}

//main
public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Original Circle: "+circle);

        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("Original Resizable Circle: "+resizableCircle);

        resizableCircle.resize(20);
        System.out.println("Resized Resizable Circle: "+resizableCircle);

        System.out.println("Original Circle Perimeter: "+circle.getPerimeter());
        System.out.println("Original Circle Area: "+circle.getArea());

        
    }
}

