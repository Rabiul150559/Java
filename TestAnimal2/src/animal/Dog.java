
package animal;


public class Dog extends Animal{
    private int  breed;

    public Dog() {
    }

    public Dog(int breed) {
        this.breed = breed;
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    
    
    

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        
        System.out.println("Woof");
//        super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
}
