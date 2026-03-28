import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }*/
        System.out.print("enter your first number:");
        /*int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");*/
        int a = sc.nextInt();
        System.out.print("enter your second number:");
        int b = sc.nextInt();
        if ( a > b){
            System.out.println("a is greater than b");
            
        }
        else if(b > a){
            System.out.println("b is greater than a");

        }
        else{
            System.out.println("a is equal to b");
        }

    }
}
