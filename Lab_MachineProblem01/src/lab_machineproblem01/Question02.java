// Title: Question 02
// Date: 10-11-2022
// Author: Lance Bernal

package lab_machineproblem01;

import javax.swing.*;

public class Question02 {
    public static void main(String[] args){
        final int HOURINSEC = 3600;
        final int MININSEC = 60;
        
        String hr, min, sec;
        int hour, minute, second;
        
        hr = JOptionPane.showInputDialog(null, "Enter Hour/s: ", "Time in Seconds", JOptionPane.QUESTION_MESSAGE);
        hour = Integer.parseInt(hr);
        min = JOptionPane.showInputDialog(null, "Enter Minute/s: ", "Time in Seconds", JOptionPane.QUESTION_MESSAGE);
        minute = Integer.parseInt(min);
        sec = JOptionPane.showInputDialog(null, "Enter Second/s: ", "Time in Seconds", JOptionPane.QUESTION_MESSAGE);
        second = Integer.parseInt(sec);
        
        JOptionPane.showMessageDialog(null, "" + hour + " Hour/s " + minute + " Minute/s and " + second + " Second/s is equal to: " + ((hour * HOURINSEC)+(minute * MININSEC)+second) + " Second/s" );

    }
}
