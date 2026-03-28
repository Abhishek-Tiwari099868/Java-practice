
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random()*100);
        int user=0;
        do { 
            System.out.println("Guess the number(1-100):");
            user = sc.nextInt();
            if(user == num){
                System.out.println("congrats , You have guessed the number");
                break;
            }
            else if(user < num){
                System.out.println("Your guess is too low");
            }
            else{
                System.out.println("Your guess is too high");
            }
            
        }while (user >=0);
        System.out.println("The number was: " + num);

    }
    
}
