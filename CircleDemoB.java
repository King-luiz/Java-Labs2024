public class CircleDemoB{
    public static void main (String[]args){
        //trial testing 

        CircleB c1 = new CircleB(2.2);
        //System.out.println(c1.toString());
        //System.out.printf("The radius of c1 is:  %.2f%n" + c1.getRadius()  + "\n Circumference is:  %.2f%n" + c1.getCircumference() + "\nThe area of the c1 is: %.2f%n" + c1.getArea());
        System.out.printf("The radius of c1 is:  %.2f%n", c1.getRadius()); 
        System.out.printf("Circumference is:  %.2f%n",c1.getCircumference());
        System.out.printf("The area of the c1 is: %.2f%n ",c1.getArea());


        CircleB c2 = new CircleB (2.1);
        //System.out.println(c2.toString());
        //System.out.printf("The radius of c2 is:  %.2f%n" + c2.getRadius()  + "\n Circumference is: %.2f%n" + c2.getCircumference()+ "\nThe area of the c2 is: %.2f%n" + c1.getArea());
        System.out.printf("The radius of c1 is:  %.2f%n", c2.getRadius()); 
        System.out.printf("Circumference is:  %.2f%n",c2.getCircumference());
        System.out.printf("The area of the c1 is: %.2f%n ",c2.getArea());


        CircleB c3 = new CircleB(2.0);
        //System.out.println(c3.toString());
        //System.out.printf("The radius of c3 is:  %.2f%n" + c3.getRadius()  + "\n Circumference is: %.2f%n" + c3.getCircumference() + "\nThe area of the c3 is: %.2f%n" + c1.getArea());
        System.out.printf("The radius of c1 is:  %.2f%n", c1.getRadius()); 
        System.out.printf("Circumference is:  %.2f%n",c2.getCircumference());
        System.out.printf("The area of the c1 is: %.2f%n ",c3.getArea());

    }
}