public class CircleB {
 //attributes
 double radius;

 // default constructors
    public CircleB(){ 
        double radius = 1.0;

    }
    //parametric constructors
    public CircleB(double r){
        radius = r;

    }

//getters radius

public double getRadius(){
    return radius;
}
//setter radius
public void setRadius(double newRadius){
     radius =  newRadius;
}

//getter for Area
public double getArea(){
    return  radius*radius*Math.PI;
}
public double getCircumference(){
    return  2*radius*radius*Math.PI;
}

public String toString(){
    return "Circle[ Radius = " + radius + "Circumference = " + getCircumference() + "]";
}
}
