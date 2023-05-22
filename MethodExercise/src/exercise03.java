// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise03 {
    public static float Average(int a, int b, int c, int d){
        return (a+b+c+d)/4;
    }
    
    public static void main(String[] args){
        String a, b, c, d;
        int first, second, third, fourth;
        a = JOptionPane.showInputDialog(null, "Enter first integer", "Average", JOptionPane.QUESTION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Enter second integer", "Average", JOptionPane.QUESTION_MESSAGE);
        c = JOptionPane.showInputDialog(null, "Enter third integer", "Average", JOptionPane.QUESTION_MESSAGE);
        d = JOptionPane.showInputDialog(null, "Enter fourth integer", "Average", JOptionPane.QUESTION_MESSAGE);
    
        first = Integer.parseInt(a);
        second = Integer.parseInt(b);
        third = Integer.parseInt(c);
        fourth = Integer.parseInt(d);

        JOptionPane.showMessageDialog(null, "The average is " + Average(first, second, third, fourth), "Averager", JOptionPane.INFORMATION_MESSAGE);
    }
}
