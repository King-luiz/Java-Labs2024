public class MyPolynomial {
    //attributes
    double[] coeffs;

    //parametric constructors
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    //getter for degree
    public int getDegree(){
        return coeffs.length - 1;
    }
    //evaluate
    public double evaluate(double x){
        double result = 0.0;
        for(int i=0; i<coeffs.length; i++){
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    // Add two polynomials and return a new polynomial
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = (i < coeffs.length ? coeffs[i] : 0) + (i < right.coeffs.length ? right.coeffs[i] : 0);
        }

        return new MyPolynomial(newCoeffs);
    }

    // Multiply two polynomials and return a new polynomial
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }

    // String representation of the polynomial
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                sb.append(coeffs[i]);

                if (i > 0) {
                    sb.append("x^" + i);
                }
                if (i > 1 && coeffs[i - 1] > 0) {
                    sb.append(" + ");
                } else if (i > 0 && coeffs[i - 1] < 0) {
                    sb.append(" - ");
                }
            }
        }
        return sb.toString();
    }

    //man class
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(4, 5);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("Evaluation of p1 at x=2: " + p1.evaluate(2));

        MyPolynomial p3 = p1.add(p2);
        System.out.println("Sum of p1 and p2: " + p3);

        MyPolynomial p4 = p1.multiply(p2);
        System.out.println("Product of p1 and p2: " + p4);
    }
}
