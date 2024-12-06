public class Staff extends Person {
    //attributes
    String school;
    double pay;

    //constructors
    public Staff(String name,String address,String school,double pay){
        super(name,address);
        this.school =school;
        this.pay = pay;
    }
    //getters and setters
    public String gerSchool(){
        return school;
    }
    public void setSchool(){
        this.school = school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }

    //toString

    public String toString(){
        return " Staff [ Person [ name : "+name+ ", Address ; "+ address +"], School : "+school+ ", Pay : "+pay+ "]";
    }

    //main class
    public static void main (String[]args){

        //test for constructors

        Staff st1 = new Staff("Lewins","645-82-48","SEKU University",857000.0d);
        System.out.println(st1);

        Staff st2 = new Staff("Nderitu","62-341-48","Kenyatta University",48700.0d);
        System.out.println(st2);
    }
    
}
