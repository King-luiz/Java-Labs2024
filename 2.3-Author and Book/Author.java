public class Author {
    //attributes
    String name;
    String email;

    //constructors
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    //setters
    public void setEmail(String email) {
        this.email = email;
    }
    //toString
    public String toString(){
        return "Author [ Name : " +name+ ", Email : "+email+"]";
    }

    //main class
    public static void main(String[] args) {

        //test for constructors
        // Creating an Author object
        Author author1 = new Author("John juma", "johnjuma@email.com");
        System.out.println(author1);

        Author author2 = new Author("king luiz", "kings@gmail.com");
        System.out.println(author2);

        //test for setters
        author1.setEmail("jane@gmail.com");
        System.out.println(author1);




    }
}
