package Inherit02;

class Car{
    String model;
    String type;

    public Car(String emodel, String etype) {
        model = emodel;
        type = etype;
    }
    
    public String broom(){
        String broom = "\nbroom broom";
        return broom;
    }
    
    public String toString(){
        String parentCar = "\nModel: " + model + "\nType: " + type;
        parentCar += broom();
        return parentCar;
    }
}
    
class Bus extends Car{
    int seatNum;
    int wheelNum;
    
    public Bus(String emodel, String etype, int eseatnum, int ewheelnum){
        super(emodel, etype);
        seatNum = eseatnum;
        wheelNum = ewheelnum;
    }
    
    public String peep(){
        String peep = "\npeep peep";
        return peep;
    }
    
    public String toString(){
        String childBus = super.toString();
        childBus += "\nNumber of Seats: " + seatNum + "\nNumber of Wheels: " + wheelNum;
        childBus += peep();
        return childBus;
    }
}

public class Inherit_02 {
    public static void main(String[] args){
        Car obj = new Car("Yamaha", "Manual");
        Bus obj1 = new Bus("Mitsubishi", "Automatic", 60, 6);
        
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }
}
