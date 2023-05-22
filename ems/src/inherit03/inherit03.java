package inherit03;

class Car{
    private String hasWheels = "yes";
    private String hasSteeringWheel = "yes";
    private int noWheels = 4;

    public String getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(String hasWheels) {
        this.hasWheels = hasWheels;
    }

    public String getHasSteeringWheel() {
        return hasSteeringWheel;
    }

    public void setHasSteeringWheel(String hasSteeringWheel) {
        this.hasSteeringWheel = hasSteeringWheel;
    }

    public int getNoWheels() {
        return noWheels;
    }

    public void setNoWheels(int noWheels) {
        this.noWheels = noWheels;
    }
    
    public void honk(){
        System.out.println("peep! peep!");
    }
    
    public void speed(){
        System.out.println("zoom zoom");
    }
    
    public String toString(){
        return "Does it have wheels?: " + hasWheels + "\nDoes it have Steering wheel?: " + hasSteeringWheel + "\nNumber of Wheels: " + noWheels;
    }
}

class SportCar extends Car{
    private String brand = "Ferrari";
    private String type = "Automatic";
    
    public void drift(){
        System.out.println("swoosh swoosh");
    }
    
    public void crash(){
        System.out.println("BOOOOOM!!");
    }
    
    public String toString(){
        String hasWheels = getHasWheels();
        String hasSteeringWheel = getHasSteeringWheel();
        int noWheels = getNoWheels();
        return "\nCar brand: " + brand + "\nCar type: " + type+ "\nDoes it have wheels?: " + hasWheels + "\nDoes it have Steering wheel?: " + hasSteeringWheel + "\nNumber of Wheels: " + noWheels;
    }
}

public class inherit03 {
    public static void main(String[] args){
        
        Car obj = new Car();
        SportCar obj1 = new SportCar();
        
        System.out.println(obj.toString());
        obj.honk();
        obj.speed();
        System.out.println(obj1.toString());
        obj1.honk();
        obj1.speed();
        obj1.drift();
        obj1.crash();
        
    }
    
}
