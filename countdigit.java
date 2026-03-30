import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("number of digits in the given number is :" + count);
    }
}
