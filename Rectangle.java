

public class Rectangle {
    //attributes 
    float length;
    float width;
    
    //default constructor
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    
    //parametric constructor
    public Rectangle(float l, float w){
        length = l;
        width = w;
    }
    
    //getters
    public float getLength(){
        return length;
    }
    
    public float getWidth(){
        return width;
    }
    
    //setters
    public void setLength(float newLength){
        length = newLength;
    }
    
    public void setWidth(float newWidth){
        width = newWidth;
    }
    
    //calculate area
    public double getArea(){
        return length * width;
    }
    
    //calculate perimeter
    public double getPerimeter(){
        return 2 * (length + width);
    }
    
    //toString
    public String toString(){
        return "Rectangle[Length =  " + length + "Width  =  " + width + "]";
    }
    
    //main class
    public static void main(String[] args){
        //Test for default
        //rect1
        Rectangle rectangle1 = new Rectangle();
        
        System.out.println(rectangle1.toString());
        System.out.println("Area:  " + rectangle1.getArea());
        System.out.println("Perimeter:  " + rectangle1.getPerimeter());

        //test for setter and getter
        //rect2

        Rectangle rectangle2 = new Rectangle(2.5f, 3.75f);
        
        System.out.println(rectangle2.toString());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        
        //rect3
        Rectangle rectangle3 = new Rectangle(10.5f, 8.25f);
        
        System.out.println(rectangle3.toString());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        
        
    }

    
}
