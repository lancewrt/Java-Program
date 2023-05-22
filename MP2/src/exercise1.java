// Title: Lesson 2 MP 01
// Date: 11-07-2022
// Author: Lance Bernal
public class exercise1 {
    public static void main(String[] args){
        exercise1 num1 = new exercise1();
        exercise1 num2 = new exercise1();
        System.out.println("The sum is: " + num1.GetSum(5, 10));
        System.out.println("The sum is: " + num2.GetSum(15, 20));
    }
    
    public int GetSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
