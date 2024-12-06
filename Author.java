public class Author{
    //attributes
    private String name;
    private String email;
    private char gender;

    //parametric constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    //setters
    public void setEmail(String email){
        this.email = email;
    }

    //toString
    @Override
    public String toString(){
        return "Author [" +" name =  " + name +  " email = "  + email + ", gender =  " + gender +"]";
    }

    //main class
    public static void main(String[] args) {

        //test for constructors

        Author author = new Author("John Doe", "johndoe@gmail.com", 'M');
        System.out.println(author);

        
        //test for getter and setter
        Author author2 = new Author("Luiz","Luiz@gmail.com",'M');
        System.out.println("Name: " + author2.getName());
        System.out.println("Email: " + author2.getEmail());
        System.out.println("Gender: " + author2.getGender());
        System.out.println(author2.toString());
    }
}