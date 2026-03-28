import java.util.*;
public class array {
    public static void main(String[] args) {
       /* double[] num = {10,20,5.2,-1};
        double sum = num[0] + num[1] + num[2] + num[3];
        System.out.println("the sum is:" + sum);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        double[] num = new double[4];
        for(int i=0;i<4;i++){
            num[i] = sc.nextDouble();
        
        double sum = 0;
        for( i=0;i<4;i++)
            sum = sum + num[i];
            System.out.println("the sum is:" + sum);
        if(num.length == 0 || num == null)
            System.out.println("Array is empty");
        
        }
        
     
    
    }

}

