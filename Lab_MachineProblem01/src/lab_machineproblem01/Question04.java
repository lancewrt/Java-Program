// Title: Question 04
// Date: 10-11-2022
// Author: Lance Bernal

package lab_machineproblem01;

import javax.swing.*;

public class Question04 {
    public static void main(String[] args){
        final int MININHOUR = 60;
        String min;
        int minute, hour, minuteF;
        
        min = JOptionPane.showInputDialog(null, "Enter minute/s worked: ", "Minutes to Hour", JOptionPane.QUESTION_MESSAGE);
        minute = Integer.parseInt(min);
        
        hour = minute / MININHOUR;
        minuteF = minute % MININHOUR;
        
        JOptionPane.showMessageDialog(null, "" + minute + " Minute/s is equal to: " + hour + " Hour/s and " +minuteF+ "Minute/s");
        
    }
}
