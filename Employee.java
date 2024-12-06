public class Employee {

//attributes
int id;
String firstName;
String lastName;
int salary;

//constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    //getters
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    
    public int getSalary(){
        return salary;
    }
    
    //setters
    
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    //get annual salary
    public int getAnnualSalary(){
        return salary * 12;
    }
    //raise salary
    public int raiseSalary(int percent){
        return salary + (salary * percent/100);

    }
    //toString method
    public String toString(){
        return "Employee [ ID : " + id + " Name : " + firstName + " " + lastName + " Salary : " + salary + "]";
    }

    //main class
    public static void main(String[] args){

        System.out.println("===============EMPLOYEE 1===================");
        System.out.println("                                               ");

        //test1 for emp 1
        Employee emp1 = new Employee(1,   "lewins",  "Moree", 50000);
        System.out.println(emp1);
        System.out.println("Annual salary of  " + emp1.getName() + " is : " + emp1.getAnnualSalary());
        System.out.println("Raised salary of  " + emp1.getName() + " by 10% to: " + emp1.raiseSalary(10));
        System.out.println("                                                                          ");

        System.out.println("===============EMPLOYEE 2===================");
        System.out.println("                                                 ");

        //test2 for emp 2
        Employee emp2 = new Employee(2,    "Joel",   "Masika", 60000);
        System.out.println(emp2);
        System.out.println("Annual salary of " + emp2.getName() + " is: " + emp2.getAnnualSalary());
        System.out.println("Raise salary of " + emp2.getName() + " by 15% to: " + emp2.raiseSalary(15));
    

}
}
