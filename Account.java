public class Account {

    //attributes
    private String id;
    private String name;
    private int balance;

    // default constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    //parametric constructors
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }


    //main class
    public static void main(String[] args) {

        //test for default
        Account account1 = new Account("12345", "John Doe", 8000);
        System.out.println(account1);

        Account account2 = new Account("67890", "Jane Smith", 50000);
        System.out.println(account2);

        //test for getters
        System.out.println("=====ACCOUNT 1=========");
        System.out.println("Account 1 ID: " + account1.getId());
        System.out.println("Account 1 Name: " + account1.getName());
        System.out.println("Account 1 Balance: " + account1.getBalance());

        // Test credit() and debit()
        System.out.println("=======credit() and debit()=======");
        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500); // debit() error
        System.out.println(account1);


        // Test transfer()
        System.out.println("=====TRANSFER=========");
        account1.transferTo(account2, 100); // toString()
        System.out.println(account1);
        System.out.println(account2);
    }
}