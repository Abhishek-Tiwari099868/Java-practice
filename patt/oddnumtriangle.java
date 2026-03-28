package patt;
import java.util.Scanner;
public class oddnumtriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // for (int i = 1; i<= 3; i++){         
        //     for(int j = 1; j <= 2*n-1;j+=2){       
        //         System.out.print(j);            --> 1 3 5 7
        //     }                                       1 3 5 7
        //     System.out.println(" ");                1 3 5 7
        // }
        for(int i =1 ; i<=n ; i++){
            int a = 1;
            for(int j = 1; j<=i ; j++){
                System.out.print(a);
                a = a+2;
            }System.out.println("");
        }
    }

}
