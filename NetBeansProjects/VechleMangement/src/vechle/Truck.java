
package vechle;


public class Truck extends Vechle{
    
 private int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }
    

    public Truck(int weight, int speed, double regularprice, String color) {
        super(speed, regularprice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(this.weight>200){
            return super.getRegularprice()-super.getRegularprice()* 0.10;
        }
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

  
        
    
 
    
}
