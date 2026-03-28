class Person{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name ,int age){
        System.out.println(name + " " + age);
    }
}

public class polymorph {
    public static void main(String args[]) {
        Person s1 = new Person();
        s1.name="harry";
        s1.age=24;
        s1.printInfo(s1.name , s1.age);
    }
    
}