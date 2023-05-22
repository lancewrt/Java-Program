/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trylangs;

/**
 *
 * @author lance
 */
import javax.swing.*;
public class TryLangs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num1, num2;
        int sum;
        
        num1 = JOptionPane.showInputDialog(null,"Enter first number: ", "Addition", JOptionPane.QUESTION_MESSAGE);
        num2 = JOptionPane.showInputDialog(null,"Enter Second number: ", "Addition", JOptionPane.QUESTION_MESSAGE);
        sum = (Integer.parseInt(num1) + Integer.parseInt(num2));
        
        JOptionPane.showMessageDialog(null, "The sum is:  "+ sum );
        
    }
    
}
