package Inherit01;

class Person{
    String name = "Lance Bernal";
    String id = "TUPM - 21 - 1913";
    int age = 20;
    
    public String toString(){
        return "\nName: " + name + "\nID: " + id + "\nAge: " + age + " years old";
    }
}

class Student extends Person{
    double average = 99.9;
    
    public String toString(){
        String result = super.toString();
        result += "\nAverage: " + average;
        return result;
    }
}

public class Inherit_01 {
    public static void main(String[] args){
        Person obj = new Person();
        Student obj1 = new Student();
        
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }
}
