public class Dog extends Mammal {
    //attribute

    //constructor
    public Dog(String name){
        super(name);
    }
    //greet()
    public void greets(){
        System.out.println("Woof");
    }
    //greets another dog
    public void greets(Dog otherDog){
        System.out.println("Woooof");
    }

    //toString
    public String toString(){
        return "Dog [Mammal [Animal [name : " + name + "]]]";
    }

    //main class
    public static void main(String[] args) {

        //test for constructors
        Dog d1 = new Dog("Buddy");
        System.out.println(d1);
        d1.greets();
        //test for greet another dog

        Dog d2 = new Dog("max");
        System.out.println(d2);
        d1.greets(d2);


    }
    
}
