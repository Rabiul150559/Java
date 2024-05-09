
package prime;


public class PrimeNumber {
    
    int primeNumber=5;
    
    
     public PrimeNumber(){
         
         
     
     }
     public String checkPrimeNumber(){
         
         int count=0;
         for(int i=1; i<=primeNumber; i++){
             
             if(primeNumber % i==0){
                 
                 count++;
             
             }
         }
         
         if(count==2){
             return "It is prime number";                            
         
         }
         else{
              return "It is  not prime number";                       
         
         
         }
     
     }
    
    
    
    
}
