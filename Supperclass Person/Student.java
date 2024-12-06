public class Student extends Person {
    //attributes
    String program;
    int year;
    double fee;

    //constructor
    public Student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;

    }
    //setters and getters

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public int setYear(){
        return year;

    }
    public void setYear(int year){
        this.year =year;
    }

    public double setFee(){
        return fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    //toString
    public String toString(){
        return "Student [ Person [ name : "+name+ "|| Address : "+address+ "], Program : "+ program+",Year : "+year+ ", Fee : "+fee+ "]";
    }

    //main class

    public static void main(String[]args){

        //test for constructors

        Student s1 = new Student("Lewins","453-286-3", " Information Tech " ,2,50000);
        System.out.println(s1);

        Student s2 = new Student("Mureithi","4757-66-2"," computer science " ,3,53000);
        System.out.println(s2);

    }

    
}
