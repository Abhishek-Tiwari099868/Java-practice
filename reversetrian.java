import java.util.Scanner;

public class reversetrian {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){           //j<=n+1-i bhi use kar sakte hai
                System.out.print("*");
            }System.out.println(" ");
        
    }
  }
}