import java.util.Scanner;
public class str {
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
    }
}
