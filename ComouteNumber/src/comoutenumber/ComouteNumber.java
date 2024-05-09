
package comoutenumber;

//import java.util.Scanner;


public class ComouteNumber {

    
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Pls enter ur number");
        
        Random random = new Random();

  
        int randomNumber = random.nextInt(26); 
     
        char randomChar = (char) ('a' + randomNumber);

     
        System.out.println("Random character: " + randomChar);
        
    }    
    
}
