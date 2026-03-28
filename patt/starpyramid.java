package patt;

import java.util.Scanner;

public class starpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int nst = 1;
        for(int i =1 ; i<=n ; i++){
            for(int k = 1; k<=n-i ; k++){ 
                System.out.print("  ");
            }

            for(int j = 1; j<=nst ; j++){    //2*i-1 is used to print the odd number of stars in each row
                System.out.print( " * ");    //new variable nsp=3 ,we can also use for this purpose
                                                //nsp--;
            }
            nst += 2;
            System.out.println(" ");
        }
    }
}
