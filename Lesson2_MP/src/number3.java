// Title: Lesson 2 MP 02
// Date: 11-07-2022
// Author: Lance Bernal
import java.util.Scanner;
public class number3 {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter three intgers: ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();
        
        System.out.println("The sum is: " + sum(num1, num2, num3));   
    }
    
    public static int sum(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
}
