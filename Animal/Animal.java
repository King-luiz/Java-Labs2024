public class Animal {
    //attribute
    String name;
    //constructor
    public Animal(String name){
        this.name = name;
    }
    //toString
    public String toString(){
        return "Animal [ name : "+name+ "]";
    }

    //main class

    public static void main (String[]args){

        //test for constructors
        //Animal a1 = new Animal("cat");
        //System.out.println(a1);


        Cat cat = new Cat("Kitty");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");

        System.out.println(cat.toString());
        cat.greets();

        System.out.println(dog1.toString());
        dog1.greets();
        dog1.greets(dog2);

    }
    
}
