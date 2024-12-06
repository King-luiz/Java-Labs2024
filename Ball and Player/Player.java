public class Player {
    //attributes
    float number;
    float x;
    float y;
    float z = 0.0f;
    //constructor
    public Player(float number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    //move
    public void move(float xDist, float yDist) {
        x += xDist;
        y += yDist;
    }
    //jump
    public void jump(float zDist){
        z += zDist;
    }
    //near
    public Boolean near(Ball ball){
        float distance = (float) Math.sqrt(Math.pow(x - ball.getX(), 2) + Math.pow(y - ball.getY(), 2));
        return distance < 8;
    }
    //kick
    //public void kick(Ball ball) {
        // Implement logic to kick the ball, possibly modifying its velocity
        // For example:
        //ball.setVelocity(new Vector2D(10, 5));

    //}

    
    //toString()
    public String toString(){
        return "Player " + number + " at (" + x + ", " + y + ", " + z + ")";
    }
    


    //main class

    public static void main(String[] args) {
        //test for constructors
        Ball ball1 = new Ball(1, 2,3);
        System.out.println("Ball1: " + ball1);

        Ball ball2 = new Ball(3,2,5);
        System.out.println("Ball2: " + ball2);

        //test for getters and setters
        ball2.setXYZ(9.0f, 10.0f, 11);
        System.out.println("Ball2 after setXYZ: " + ball2);

    }

}

