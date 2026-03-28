package patt;
import java.util.Scanner;
public class solidrec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i<= 3; i++){          //outer loop for rows
            for(int j = 1; j <= n;j++){       //inner loop for columns
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        

        
    }

    
}
