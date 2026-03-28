class pen{
    String color;
    String type;                   //function start from small letter and class start from capital letter
    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){                         //-->Non-parameterized constructor
        System.out.println("constructor called"); 
}
    Student(String name , int age){          //-->parameterized constructor
        this.name = name;
        this.age = age;

}
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}


public class oops {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.type = "ballpoint";
       
        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "gel";
        // pen1.printcolor();
        // pen2.printcolor();

        Student s1 = new Student();
        s1.name = "harry";
        s1.age = 24;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();

    }
    
}
