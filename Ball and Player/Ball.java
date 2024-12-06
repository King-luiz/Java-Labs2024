public class Ball {
    //attributes
    float x;
    float y;
    float z;

    //constructor
    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //getters
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    
    //setteR for XYZ
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //toString()
    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ", " + z + ")";
    }

    //main class
    public static void main(String[] args) {
        //test for constructors
        Ball ball1 = new Ball(1.0f, 2.0f,5);
        System.out.println("Ball1: " + ball1);

        Ball ball2 = new Ball(3.4f, 5.6f,2);
        System.out.println("Ball2: " + ball2);

        //test for getters and setters
        ball2.setXYZ(9.0f, 10.0f, 11);
        System.out.println("Ball2 after setXYZ: " + ball2);


        //test for toString()
        Ball ball3 = new Ball(12.3f, 14.5f, 16);
        System.out.println("Ball 3: " + ball3);
        System.out.println("Ball 3's XYZ: " + ball3.toString());
        System.out.println("Ball 3's X: " + ball3.getX());
        System.out.println("Ball 3's Y: " + ball3.getY());
        System.out.println("Ball 3's Z: " + ball3.getZ());

    }
    
}
