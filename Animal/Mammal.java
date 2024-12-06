public class Mammal extends Animal {
    //attributes


    //constructor
    public Mammal(String name){
        super(name);
    }
    //toString
    public String toString(){
        return "Mammal [ Animal [ Name : "+name+"]]";
    }
    
    //main class

    public static void main (String[]args){

        //test for constructors
        Mammal m1 = new Mammal("dog");
        System.out.println(m1);
    }
}
