public class MyComplex {
    //attributes
    private double real;
    private double imag;

    // Default constructor
    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    // parametric Constructor
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and setters for real and imaginary parts
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Set both real and imaginary parts
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Check if the real part is zero
    public boolean isReal() {
        return real == 0;
    }
    // Check if the imaginary part is zero
    public boolean isImaginary() {
        return imag == 0;
    }
    // Check equality with given real and imaginary parts
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    // Check equality with another MyComplex object
    public boolean equals(MyComplex another) {
        return real == another.real && imag == another.imag;
    }

    // Calculate the magnitude of the complex number
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Add another MyComplex object into this instance
    public MyComplex addInto(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }

    // Add another MyComplex object and return a new MyComplex object
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    // String representation of the complex number
    @Override
    public String toString() {
        return real + " + " + imag + " i ";
    }

    //maim class

    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(3, 4);
        MyComplex complex2 = new MyComplex(5, 6);

        //printing the complex numbers
        System.out.println("Complex Number 1: " + complex1);
        System.out.println("Complex Number 2: " + complex2);
        System.out.println("                                      ");

        // Check if complex1 is real or imaginary
        System.out.println("Is complex1 real? " + complex1.isReal());
        System.out.println("Is complex1 imaginary? " + complex1.isImaginary());
        System.out.println("                              ");

        // Add complex2 into complex1
        complex1.addInto(complex2);
        System.out.println("After adding complex2 into complex1: " + complex1);
        System.out.println("                              ");

        // Add complex1 and complex2 and create a new complex number
        MyComplex complex3 = complex1.addNew(complex2);
        System.out.println("Sum of complex1 and complex2: " + complex3);
    }  

}
