package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfday = Scanner.nextInt();

        System.out.println("Pls enter the Day Number");
        String dayNumber = "";
        switch (numberOfday) {

            case 1:
                dayNumber = "Saturday";
                break;

            case 2:
                dayNumber = "Sunday";

            case 3:
                dayNumber = "Monday";
                break;

            case 4:
                dayNumber = "Tuesday";
                break;
            case 5:
                dayNumber = "Wednesday";
                break;
            case 6:
                dayNumber = "Thursday";
                 break;               
            case 7:
                dayNumber = "Friday";

        }
    

        default:
        dayNumber="invild number"
    
        
        System.out.println("");
        
     
    }
    
}
