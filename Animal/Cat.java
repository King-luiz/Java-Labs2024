public class Cat extends Mammal {
    //attributes

    //constructors
    public Cat (String name){
        super(name);
    }
    public void greets(){
      System.out.println("Meow");

    }
    //toString()
    public String toString(){
        return "Cat [ Mammal [Animal [name : " + name + "]]]";
    }

    //main class
    public static void main(String[] args) {

        //test for constructors
        Cat c1 = new Cat("Tom");
        System.out.println(c1);
        c1.greets();
    }
    
}
