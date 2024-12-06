public class Container {
    //attributes
    int x1;
    int y1;
    int x2;
    int y2;

    //constructor
    public Container(int x, int y, int width, int heigth) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y + heigth;
    }
    //getters
    public int getX() {
        return x1;
    }
    public int getY() {
        return y1;
    }
    public int getWidth() {
        return x2 - x1 +1;
    }
    public int getHeight() {
        return y2 - y1 + 1;
    }

//collide

public boolean collides(Ball ball) {
        return ball.getX() >= x1 && ball.getX() <= x2 &&
               ball.getY() >= y1 && ball.getY() <= y2;
    }

    @Override
    public String toString() {
        return "Container[" + x1 + ", " + y1 + "], [" + x2 + ", " + y2 + "]";
    }

//main class
    public static void main(String[] args) {
        Container container = new Container(0, 0, 10, 30);
    
        System.out.println("Container: " + container);
        System.out.println("Width: " + container.getWidth());
        System.out.println("Height: " + container.getHeight());
    
        // Assuming you have a Ball class with getX() and getY() methods
        Ball ball1 = new Ball(50,5,10,0,20);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
        ball1.move();
        //box.collidesWith(ball1);
        System.out.println(ball1);
        Ball ball2 = new Ball(0,10,21,5,2);
    
        System.out.println("Ball 1 collides with container: " + container.collides(ball1));
        System.out.println("Ball 2 collides with container: " + container.collides(ball2));
    }
}
}
