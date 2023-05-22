// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise01 {
    public static int HighestNumber(int a, int b){
        if(a > b) 
            return a;
        else 
            return b;
    }
    
    public static void main(String[] args){
        String a, b;
        int first, second;
        
        a = JOptionPane.showInputDialog(null, "Enter first integer", "Highest Integer", JOptionPane.QUESTION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Enter second integer", "Highest Integer", JOptionPane.QUESTION_MESSAGE);
    
        first = Integer.parseInt(a);
        second = Integer.parseInt(b);
        
        JOptionPane.showMessageDialog(null, "The highest integer is " + HighestNumber(first, second), "Highest Integer", JOptionPane.INFORMATION_MESSAGE);
    }
}
