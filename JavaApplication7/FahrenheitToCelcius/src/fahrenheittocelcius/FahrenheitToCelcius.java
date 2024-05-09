package fahrenheittocelcius;

//import java.util.Scanner;

import java.util.Scanner;


public class FahrenheitToCelcius {

    public static void main(String[] args) {
//        
//        Scanner input=new Scanner(System.in);
//        System.out.println("Pls enter temperature in Fahrenheit:");
//        
//        float fertemp=input.nextFloat();
//        float result= ((fertemp-32)/9)*5;
//        System.out.println("temperature in Celsius" + result);

//        Scanner scanner = new Scanner(System.in);
//        int maxNumber;
//        System.out.println(" Enter the first number");
//
//        int firstNumber = scanner.nextInt();
//        System.out.println(" Enter the second number");
//        int secondNumber = scanner.nextInt();
//        System.out.println(" Enter the Third number");
//        int thirdNumber = scanner.nextInt();
//        if(firstNumber> secondNumber & firstNumber> thirdNumber){
//            maxNumber= firstNumber;
//        }
//        else if (secondNumber>firstNumber & secondNumber> thirdNumber){
//            maxNumber=secondNumber;
//        }
//        else{
//            maxNumber=thirdNumber;
//        }
//        System.out.println("Maxnumber is" + maxNumber);
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        if(marks < 33){
            System.out.println("F");
        
        }
        else if(marks < 39){
            System.out.println("D");
        
        }
        else if(marks < 49){
            System.out.println("C");
        
        }
        else if(marks < 59){
            System.out.println("B");
        
        }
        else if(marks < 69){
            System.out.println("A");
        
        }
        else if(marks < 89){
            System.out.println("A+");
        
        }
        else if(marks < 79){
            System.out.println("A-");
        
        }
        else{
            System.out.println("A+");
        
        
        }
        
        
    
      
        
       
        
        
        
        
        

    }

}
