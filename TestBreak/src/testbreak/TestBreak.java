
package testbreak;

import java.util.Scanner;


public class TestBreak {

                       
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter value");
            int userInput=s.nextInt();
            sum +=userInput;
            if(sum>=200){
            
            }
            else if(sum>=100){
                continue;
            
            }
            System.out.println("Sum is " + sum);
            
            
        
        }
        
        
    }
    
}
