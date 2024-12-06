public class Customer {
    int id;
    String name;
    char gender;

    // Constructor
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    
    // toString
    @Override
    public String toString() {
        return "Customer [ Name = " + name +",ID = " + id + "]";
    }

    // main method
    public static void main(String[] args) {

        //test for constructor
        Customer customer1 = new Customer(47, "Lewins Moree", 'M');
        Customer customer2 = new Customer(35, "Patricia Njoki", 'F');

        System.out.println("=====CUSTOMER 1=====");
        System.out.println(customer1);
        System.out.println("                 ");
        System.out.println("=====CUSTOMER 2=====");
        System.out.println(customer2);
    
        System.out.println("                 ");

        // Testing getters
        System.out.println("===TEST FOR GETTER=====");
        customer1.getName();
        customer1.getGender();
        System.out.println("Customer 1 info : " + customer1);
        System.out.println("                 ");
        // Testing toString method
        System.out.println("===TEST FOR TOSTRING=====");
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
