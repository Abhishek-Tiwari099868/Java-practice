import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        //int a = 10;
        /*int b = 20;
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
        int cal = (a*b)/(a-b);
        System.out.println("The result of (a*b)/(a-b) is: " + cal);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String name = sc.nextLine(); // take complete name as input , but if we use next() it will take only first word
        //nextint() , nextfloat() , nextdouble() for other data types
        System.out.println(name);


    }
}


