public class Person {

    //attributes
    String name;
    String address;

    //parametric constructors
    public Person(String name, String address){
        this.name = name;
        this.address = address;

    }

    //getters
    public String getName(){
        return name;
    }
    public void setName(String name){
        name = name;
    }

    public String getAddress(){
        return address;
    }
    //setAddress
    public void setAddress(String address){
       address = address;
    }

    //toString
    public String toString(){
        return "Person [ name : "+name+ " || Address : "+address+ "]";
    }


    //main class

    public static void main (String[]args){

    //test for constructors
    Person p1 = new Person("lewins","254-58-47");
    System.out.println("Person 1 details : "+p1);


    Person p2 = new Person("Mureithi","0420-48-47");
    System.out.println("Person 2 details : "+p2);


    //test for setters and getters
    
    //p2.setAddress("534-6565-009");
    ////p2.setName("Luiz Codex");
    //System.out.println("Updated details for Person1: "+p2);



    }
    
}
