
package productmanagment;

import product.ElectronicProduct;

public class ProductManagment {

  
    public static void main(String[] args) {
        
        ElectronicProduct electronicProduct=new ElectronicProduct(500, "Motorcare", 600);
        System.out.println(electronicProduct.getSalePrice());
        
        
       
       
    }
    
}
