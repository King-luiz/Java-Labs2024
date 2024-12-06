public class Invoice {

    // Attributes
    int id;
    Customer customer;
    double amount;

    // Constructors
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //customer id
    public int getCustomerId() {
        return customer.getId();
    }
    //customer name
    public String getCustomerName() {
        return customer.getName();
    }
    //customer discount
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    //amt after disc
    public double getAmountAfterDiscount() {
        return amount - (amount * (customer.getDiscount() / 100.0));
    }
    //toString
    @Override
    public String toString() {
        return "Invoice [ID=" + id + ", Customer=" + customer + ", Amount=" + amount + "]";
    }

    //main class
    public static void main(String[] args) {
        // test for constructors
        Customer customer = new Customer(0420, "Lewins Mureithi", 10);
        Invoice invoice = new Invoice(47, customer, 200.0);
        System.out.println(invoice);

        // test for getters and setters
        invoice.setAmount(300.0);
        System.out.println("New Amount: " + invoice.getAmount());
        System.out.println("Customer ID: " + invoice.getCustomerId());
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Customer Discount: " + invoice.getCustomerDiscount());
        System.out.println("Amount after discount: " + invoice.getAmountAfterDiscount());

        // testing toString method
        System.out.println(invoice);
    }






    
}
