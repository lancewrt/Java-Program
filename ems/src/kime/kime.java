public class kime {
    public static void main(String[] args) {
        Car c1 = new Car();
        SportCar s1 = new SportCar();
        
        System.out.println(c1.toString("White", 4));
        System.out.println(s1.toString("White", 4, "Bugatti", 2));      
    }
}

class Car {
    private String color;
    private int wheels; 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    
    public String toString(String color, int wheels) {
        return color+ " " +wheels;
    }
}

class SportCar extends Car {
    private String brand;
    private int capacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public String toString(String color, int wheels, String brand, int capacity) {
        return color+ " " +wheels+ " " +brand+ " " +capacity;
    }
}