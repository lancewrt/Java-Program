// Title: Lesson 2 MP 03
// Date: 11-07-2022
// Author: Lance Bernal
import java.util.Scanner;
public class exercise3 {
    public static int sum(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    
    public static int product(int a, int b, int c){
        int product = a * b * c;
        return product;
    }
    
    public static float average(int a, int b, int c){
        int average = (a + b + c)/3;
        return average;
    }
    
    public static int highest(int a, int b, int c){
        if( a > b && a > c)
            return a;
        else if( b > a && b > c)
            return b;
        else
            return c;
    }
    
    public static int lowest(int a, int b, int c){
        if( a < b && a < c)
            return a;
        else if( b < a && b < c)
            return b;
        else
            return c;
    }
    
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter three intgers: ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
        
        System.out.println("The sum is: " + sum(num1, num2, num3));  
        System.out.println("The product is: " + product(num1, num2, num3)); 
        System.out.println("The average is: " + average(num1, num2, num3)); 
        System.out.println("The highest number is: " + highest(num1, num2, num3)); 
        System.out.println("The lowest number is: " + lowest(num1, num2, num3));
           
    }
}
    
   
   
