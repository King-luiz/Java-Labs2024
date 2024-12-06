public class Ball {
    //attributes
    float x;
    float y;
    int radius;
    float xDelta;
     float yDelta;

     //contractors
     public Ball(float x,float y,int radius,float xDelta, float yDelta){
        this.x =x;
        this.y =y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
     }

     //getters and getters
     public float getX(){
        return x;
     }
     public void setX(float x){
        this.x = x;
     }
     public float getY(){
        return y;
     }
     public void setY(float y){
        this.y = y;
     }
     public int getRadius(){
        return radius;
     }
     public void setRadius(int radius){
        this.radius = radius;
     }
     public float getXDelta(){
        return xDelta;
     }
     public void setXDelta(float xDelta){
        this.xDelta = xDelta;
     }
     public float getYDelta(){
        return yDelta;
     }
     public void setYDelta(float yDelta){
        this.yDelta = yDelta;
     }
     public void move(){
        x += xDelta;
        y += yDelta ;
     }
     public void reflectHorizontal(){
        xDelta = -yDelta;
     }
     public void reflectVertical(){
         yDelta = - xDelta;
      }
      //toString

      public String toString(){
        return "Ball [("+x+" , "+y+ "), Speed = ("+xDelta+ " "+yDelta+ ")]";
      }

     //main class

     public static void main(String[] args) {
         //test for constructors

         System.out.println("==========TEST 1==========");
         System.out.println("                                     ");
         Ball b1 = new Ball(2,3,7,1,2);
         System.out.println(b1);
         System.out.println("                                     ");

         //test for getter and setter

System.out.println("==========TEST 2==========");
         System.out.println("                                     ");
         Ball ball = new Ball(5,8,3,9,2);
         System.out.println(ball);
         System.out.println("                                     ");

         System.out.println("==========TEST FOR SETTER AND GETTER==========");
         System.out.println("                                     ");

           ball.setX(80.0f);
           ball.setY(35.0f);
           ball.setRadius(5);
           ball.setXDelta(4.0f);
           ball.setYDelta(6.0f);
           System.out.println(ball); // toString()
           System.out.println("x is: " + ball.getX());
           System.out.println("y is: " + ball.getY());
           System.out.println("radius is: " + ball.getRadius());
           System.out.println("xDelta is: " + ball.getXDelta());
           System.out.println("yDelta is: " + ball.getYDelta());
           System.out.println("                                     ");

            //Bounce the ball within the boundary

           System.out.println("====Bounce the ball within the boundary====");
           System.out.println("                                     ");
           float xMin = 0.0f;
           float xMax = 100.0f;
           float yMin = 0.0f;
           float yMax = 50.0f;
           for (int i = 0; i < 15; i++) {
           ball.move();
           System.out.println(ball);
           float xNew = ball.getX();
           float yNew = ball.getY();
           int radius = ball.getRadius();
           // Check boundary value to bounce back

           if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
           ball.reflectHorizontal();
           }
           if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
           ball.reflectVertical();
           }
        }
    }
}
