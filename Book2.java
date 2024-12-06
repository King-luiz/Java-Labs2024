
import java.util.Set;


public class Book2 {
//attributes
String name;
Author[] authors;
double price;
int qty =0;
//default constructors
public Book2(String name,Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
}
//parametric constructor
public Book2(String name, Author[] authors, double price, int qty) {
    this(name,authors,price);
    this.qty = qty;
}
//getters
public String getName() {
    return name;
}
public Author[] getAuthors() {
    return authors;
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
//toString
public String toString(){
    return "Book [ name = " + name + ", authors = " + authors + ", price = " + price +", quality = "+qty+ "]";
}

public String getAuthorNames() {
    StringBuilder sb = new StringBuilder();
    for(Author a: authors){
        sb.append(a.getName()).append(", "); // append each author's name with a comma and a space in between
   
    }
    return sb.toString();
}


//main class

    public static void main(String[] args) {

        // Creating an Author object
        Author author1 = new Author("John Doe", "johndoe@email.com", 'M');
        
        Author author2 = new Author("james kiki","kiki@gmail.com",'M');

        // Creating an Author array
        Author[] authors = new Author[]{author1 ,author2};

        // Creating a Book object with three arguments
        Book2 book1 = new Book2("The Lord of the Rings", authors, 25.99, 342);
        Book2 book2 = new Book2("Pride and Prejudice", authors , 19.95, 2);

        // Print book details
        System.out.println("book1 "+book1.toString());
        System.out.println("book2 "+book2.toString());

        // Access and modify book properties
        System.out.println("Book 1 Author(s): " + book1.getAuthorNames());
        book1.setPrice(30.00);  // Update price
        System.out.println("Updated book 1 price: " + book1.getPrice());


    }
}

