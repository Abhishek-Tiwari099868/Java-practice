import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        int count = 0;
        it sum = 0;
        while(n!=0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
            count++;
        }
        System.out.println("number of digits in the given number is :" + count);
        System.out.println("sum of digits in the given number is :" + sum);
    }
}
