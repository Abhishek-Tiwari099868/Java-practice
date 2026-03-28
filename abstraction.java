abstract class Animal{                 //it is a concept of abstraction
    abstract void walk();

     Animal() {
        System.out.println("Animal is created");
    }
    
    public void eat(){
        System.out.println("eats food");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.walk();
        // Animal a1 = new Animal();
        // a1.walk(); // This will give error as we cannot create object of abstract class
    }
}
