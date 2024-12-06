    
    interface Movable {

//defines abstract methods
    void moveup();
    void moveDown();
    void moveLeft();
    void moveRight();
}

//movablepoints implements interface movable
class MovablePoints implements Movable{
    //Attributes
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    //Constructor
    MovablePoints(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //toString()
    public String toString(){
        return "(x: " + x + ", y: " + y + "), Speed:(" + x+ ", " +y+")";

    }
    
    //Methods
    public void moveup(){
        y += ySpeed;
    }
    public void moveDown(){
        y -= ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
}

//movableCircle implements Circle
class MovableCircle implements Movable {
    //Attributes
    int radius;
    MovablePoints center;

    //Constructor
    MovableCircle(int x, int y, int radius,int xSpeed, int ySpeed){
        this.center = new MovablePoints(x, y, xSpeed, ySpeed);
        this.radius = radius;

    }
    //Methods
    public void moveup(){
        center.moveup();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
    //toString()
    public String toString(){
        return "Circle at (" + center.x + ", " + center.y + ")  radius : "+radius ;
    }
}

public class Main {
    public static void main(String[] args) {

        MovableCircle circle = new MovableCircle(5, 5, 3, 2, 2);
        System.out.println("Initial Circle: " + circle);

        circle.moveup();
        circle.moveRight();
        System.out.println("After moving up and right: " + circle);


    }
}