public class Book {
    //attributes
    String name;
    Author author;
    double price;
    int qty;

    //default constructors
    public Book() {
        this.name = "";
        this.author = new Author("", "", 'M');
        this.price = 0.0;
        this.qty = 0;
    }

    //parametric constructor
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //getters
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return qty;
    }
    //setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int qty) {
        this.qty = qty;
    }
    public void setName(String name) {
        this.name = name;
    }


    //toString
    public String toString(){
        return "Book [ name = " + name + ", author = " + author + ", price = " + price + ", quality = "+qty+ "]";
    }

    // calling new methods
    //public String getAuthorName(){
    //    return author.getName;
    //}
    //public String getAuthorEmail(){
    //    return author.getAuthorEmail;
    //}
    //public char getAuthorGender(){
    //    return author.getGender;
    //}

    //main class
    public static void main(String[] args) {
        //test for constructors
        Author author = new Author("Luiz Moree", "Mureithiluiz@gmail.com", 'M');
        Book book = new Book("The Catcher in the Rye", author, 9.99, 10);
        System.out.println(book);

        //test for setter
        //book.setAuthor("james juma", "juma@gmail.com", 'M');
        book.setName("I will Marry when i want");
        book.setPrice(12.99);
        book.setQuantity(5);
        System.out.println(book);
       
        //test for getter and setter
        Book book2 = new Book("To Kill a Mockingbird", new Author("Harper Lee", "harperlee@gmail.com", 'F'), 15.99, 8);
        System.out.println("Name: " + book2.getName());
        System.out.println("Author: " + book2.getAuthor().getName());
        System.out.println("Price: " + book2.getPrice());
        System.out.println("Quantity: " + book2.getQuantity());
        System.out.println(book2.toString());
    }



    
    
}
