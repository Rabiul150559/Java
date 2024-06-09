




public class Question2 {
    
    public static void main(String[] args) {
        
        Car car = new Car();
        car.start();
        car.stop();
        
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        
        Car carVehicle = new Car();
        carVehicle.start();
        carVehicle.stop();
        
        Motorcycle motorVehicle = new Motorcycle();
        motorVehicle.start();
        motorVehicle.stop();
        
    }

    private static class Motorcycle {

        public Motorcycle() {
        }

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void stop() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}