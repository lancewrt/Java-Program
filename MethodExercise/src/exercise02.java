// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise02 {
    public static boolean LargerNumber(double a, double b){
        return(a > b);
   }
    
    public static void main(String[] args){
        String a, b;
        double first, second;
        
        a = JOptionPane.showInputDialog(null, "Enter first number", "Larger Number", JOptionPane.QUESTION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Enter second number", "Larger Number", JOptionPane.QUESTION_MESSAGE);
    
        first = Double.parseDouble(a);
        second = Double.parseDouble(b);
        
        JOptionPane.showMessageDialog(null, "" + LargerNumber(first, second), "Larger Number", JOptionPane.INFORMATION_MESSAGE);
    }
}
