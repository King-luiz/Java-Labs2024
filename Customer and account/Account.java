public class Account {
    private int id;
    Customer customer;
    double balance=0.0;

    //default constructors
    public Account(int id, Customer customer,double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    //parametric constructors
    public Account(int id, Customer customer) {
        this(id, customer, 0.0);

    }
    //getters
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    //customer name
    public String getCustomerName(){
        return customer.getName();
    }
    //setters for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //toString
    @Override
    public String toString() {
        return "Account [id=" + id + ", Customer=" + customer + ", Balance=" + balance + "]";
    
    }
    public Account deposit(double amount){
        balance+=amount;
        return this;
    }
    //withdraw
    public Account withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return this;
        }
        else{
            System.out.println("Insufficient funds");
            return null;
        }
    }

    //main class
    public static void main(String[] args) {

        //test for constructors
        Customer customer1 = new Customer(47, "Luiz Cedex", 'M');
        Account account1 = new Account(808, customer1 ,20000);


        //test for getter
        System.out.println("=======Account 1 bal======");
        System.out.println("Initial balance: "+account1.getBalance());
        Account account2 = new Account(102, customer1, 1500);


        System.out.println("=======Account 1 bal after depo======");
        System.out.println("Account 1 balance after deposit: "+account1.deposit(500.0).getBalance());
        System.out.println("=======Account 2 bal after depo========");
        System.out.println("Account 2 balance after deposit: "+account2.deposit(300.0).getBalance());

        System.out.println("=======Account 1 bal after with========");

        System.out.println("Account 1 balance after withdrawal: "+account1.withdraw(200.0).getBalance());
        System.out.println("=======Account 2 bal after with========");
        System.out.println("Account 2 balance after withdrawal: "+account2.withdraw(400.0).getBalance());

        System.out.println("Account 1 customer name: "+account1.getCustomerName());
        System.out.println("Account 2 customer name: "+account2.getCustomerName());


        System.out.println("=======Account 1 and 2 details========");
        System.out.println("Account 1 details: "+account1);
        System.out.println("Account 2 details: "+account2);



    }



    
}
