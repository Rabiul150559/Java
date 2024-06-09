package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        System.out.println("Pls enter your nuber");
         int factorial = 1;

        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {

          
               factorial= factorial * i;
                
         }
        System.out.println(factorial);
    }

}
