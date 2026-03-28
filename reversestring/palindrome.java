import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = "";
        int length = input.length();
        for(int i =0; i < length; i++)
        {
            result = input.charAt(i) + result;  // Prepend the current character to the result string
        }
        System.out.println("Reversed string: " + result);
        if(input.equals(result)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
    }
}
