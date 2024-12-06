public class Customer {
    // attributes
    int id;
    String name;
    int discount;

    // constructors
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

      // getters
      public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    // setters
    public void setDiscount(int discount) {
        this.discount= discount;
    }

    //toString
    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + ", Discount=" + discount + "]";
    }

    //main class
    public static void main(String[] args) {
        // test for constructors
        System.out.println("===========test fot constructors=========");
        Customer customer1 = new Customer(1, "Kamene Goro", 10);
        System.out.println(customer1);
        System.out.println("                                ");

        Customer customer2 = new Customer(2, "Jane Wanjiku", 5);
        System.out.println(customer2);
        System.out.println("                                ");

        // test for getters and setters
        System.out.println("=======Test for getters and setters========");
        System.out.println("Customer 1 ID: " + customer1.getId());
        System.out.println("Customer 2 Name: " + customer2.getName());


        System.out.println("                                ");
        customer1.setDiscount(15);
        System.out.println("Customer 1 Discount: " + customer1.getDiscount());
      
        System.out.println("                   ");
        customer2.setDiscount(10);
        System.out.println("Customer 2 Discount: " + customer2.getDiscount());
        // testing toString method

        System.out.println("                                ");
        System.out.println("========test for string=========");
        System.out.println(customer1);
        System.out.println(customer2);

    }


}
