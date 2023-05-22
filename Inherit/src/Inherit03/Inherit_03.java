package Inherit03;

class Car{
    private String model;
    private String type;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }
    
    public String broom(){
        return "\nbroom broom"; 
    }
    
    public String peep(){
        return "\npeep peep";
    }
    
    public String toString(){
        String result = "\nModel: " + model + "\nType: " + type;
        result += broom();
        result += peep();
        return result;
    }
}

class SportCar extends Car{
    private int seatNum;
    private String isFast;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getIsFast() {
        return isFast;
    }

    public void setIsFast(String isFast) {
        this.isFast = isFast;
    }

    public SportCar(String model, String type, int seatNum, String isFast) {
        super(model, type);
        this.seatNum = seatNum;
        this.isFast = isFast;
    }
    
    public String drift(){
        return "\nswoosh swoosh";
    }
    
    public String crash(){
        return "\nBOOM!";
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nNumber of Seats: " + seatNum + "\nIs it Fast? " + isFast;
        result += drift();
        result += crash();
        
        return result;
    }   
}

public class Inherit_03 {
    public static void main(String[] args){
        Car obj = new Car("Honda", "Manual");
        SportCar obj1 = new SportCar("Ferrari", "Automatic", 2, "yes");
        
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }
}
