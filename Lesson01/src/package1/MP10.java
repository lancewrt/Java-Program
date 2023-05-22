/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import javax.swing.*;
public class MP10 {
    public static void main(String[]args){
        String wageString, dependentString;
        double wage, weeklyPay;
        int dependents;
        
        final double HOURS_IN_WEEK= 37.5;
        
        wageString=JOptionPane.showInputDialog(null, "Enter your employee's wage"
        , "Salary dialog 1",JOptionPane.WARNING_MESSAGE );
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
        
        
        dependentString=JOptionPane.showInputDialog(null, "How many dependents?",
                "Salary Dialog 2",JOptionPane.QUESTION_MESSAGE);
         dependents= Integer.parseInt(dependentString);
        
        JOptionPane.showMessageDialog(null, "Your weekly salary is "+ weeklyPay +
                "\n Deductions will be made for" + dependents+ "dependents" );
        
        
        
        
        
        
        
    }
}
