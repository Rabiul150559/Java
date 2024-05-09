
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter ur number");
        int userInput=input.nextInt();
        int count=0;
        for(int i=1; i<=userInput; i++){
            if( userInput % i ==0){
                count+=1;
             }
            }
            if (count==2)
                System.out.println("It is prime number");
            else{
                System.out.println("It is not prime number");
            }
            
        
        
       
                
        
        
        
        
        
        
        
    }
    
}
