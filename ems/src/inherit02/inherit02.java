package inherit02;

class Car{
    String isMoving = "yes";
    String forLand = "yes";
    int noWheels = 4;
    
    public void honk(){
        System.out.println("peep! peep!");
    }
    
    public void speed(){
        System.out.println("zoom zoom");
    }
    
    public String toString(){
        return "Is it moving: " + isMoving + "\nDoes it travel on land: " + forLand + "\nNumber of Wheels: " + noWheels;
    }
}

class Bus extends Car{
    String type = "Manual";
    String brand = "Yamaha ";
    String isBig = "yes";
    int noWheels = 6;
    
    
    public String toString(){
            return "\nCar brand: " + brand + "\nCar type: " + type +"\nIs it moving: " + isMoving + "\nDoes it travel on land: " + forLand +  "\nIs it big? " + isBig + "\nNumber of Wheels: " + noWheels;
    }
}

public class inherit02 {
    public static void main(String[] args){
        
        Car obj = new Car();
        Bus obj1 = new Bus();
        
        System.out.println(obj.toString());
        obj.honk();
        obj.speed();
        System.out.println(obj1.toString());
        obj1.honk();
        obj1.speed();
        
    }
}
