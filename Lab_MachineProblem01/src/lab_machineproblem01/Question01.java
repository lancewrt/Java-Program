// Title: Question 01
// Date: 10-11-2022
// Author: Lance Bernal

package lab_machineproblem01;

import javax.swing.*;

public class Question01 {
    public static void main(String[] args){
        
        final double KM = 1.60935;
        String mile;
        float f_mile;
        
        mile = JOptionPane.showInputDialog(null, "Enter the distance in miles: ", "Miles to Kilometer", JOptionPane.QUESTION_MESSAGE);
        f_mile = Float.parseFloat(mile);
        
        JOptionPane.showMessageDialog(null, " " + f_mile + " Miles in Kilometers is : " + (f_mile * KM));
        
    }
}
