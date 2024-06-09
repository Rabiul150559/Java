
package vechlemangement;

import animal.Dog;
import product.ElectronicProduct;
import vechle.Truck;




public class VechleMangement {

    
    public static void main(String[] args) {
        Truck truck=new Truck(300, 0, 300,  "white");
        
        System.out.print(truck.getSalePrice());
        
        Dog dog = new Dog("Doggy", "German", 2);
        dog.makeSound();
        
        ElectronicProduct produc=new ElectronicProduct(2, "Moble", 100);
        
        System.out.println(produc.getRegularPrice());
        
        
       
               
}
    
}
