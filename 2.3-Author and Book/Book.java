
import javax.sound.sampled.SourceDataLine;

public class Book {
    //attributes
    String isbn;
    String name;
    Author author;
    double price;
    int qty =0;


    //default constructors
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    //parametric constructors
    public Book(String isbn, String name, Author author, double price, int qty) {
        this(isbn, name, author, price);
        this.qty = qty;
    }
    //getters
    public String getIsbn() {
        return isbn;
    }
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
    public void setQty(){
        this.qty = qty;
    }
    //authorName
    public String getAuthorName(){
        return author.getName();
    }
    //toString
    @Override
    public String toString() {
        return "Book [ISBN=" + isbn + ", Name=" + name + ", Author=" + author + ", Price=" + price + ", Qty=" + qty + "]";
    }

    //main class
    public static void main(String[] args) {
        //test for constructors
        Author author = new Author("Caroline Okangi", "cokangi@gmail.com");
        Book book = new Book("1239987", "The Great Gatsby", author, 25.0, 10);
        System.out.println(book);


        //test for getter and setter
        book.setPrice(30.0);
        System.out.println("New Price: " + book.getPrice());
        System.out.println("Author Name: " + book.getAuthorName());
    }
    
}
