/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lance
 */
public class Temperature {
    private double temperature;

    public double getFahrenheit() {
        return temperature;
    }

    public void setFahrenheit(double temperature) {
        this.temperature = (temperature - 32) * ((double)5/9);
    }
    
    public double getCelcius() {
        return temperature;
    }
    
    public void setCelcius(double temperature) {
        this.temperature = (((double)9/5 * temperature) + 32);
    }
    
    public static void main(String[] args) {
        Temperature obj1 = new Temperature();
        Temperature obj2 = new Temperature();
        obj1.setFahrenheit(100);
        obj2.setCelcius(100);
        
        System.out.println("The temperature in Fahrenheit: : " + obj2.getFahrenheit());
        System.out.println("The temperature in Celcius: " + obj1.getCelcius());
        
    }
}

