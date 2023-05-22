// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise05 {
    public static int sum(int a, int b){
        int sum = 0;
        int i;
        if(a > b){
            JOptionPane.showMessageDialog(null, "The first integer should be lower or equal to the second integer", "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{
            for(i = a; i <= b; i++){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        String a, b;
        int first, second;
        
        a = JOptionPane.showInputDialog(null, "Enter first number", "Larger Number", JOptionPane.QUESTION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Enter second number", "Larger Number", JOptionPane.QUESTION_MESSAGE);

        first = Integer.parseInt(a);
        second = Integer.parseInt(b);
        
        JOptionPane.showMessageDialog(null, "The sum is: " + sum(first, second), "Sum from Range", JOptionPane.INFORMATION_MESSAGE);
    }
}
