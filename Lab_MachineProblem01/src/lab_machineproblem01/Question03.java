// Title: Question 03
// Date: 10-11-2022
// Author: Lance Bernal

package lab_machineproblem01;

import javax.swing.*;

public class Question03 {
    public static void main(String[] args){
        final int SECTOHOUR = 3600;
        final int SECTOMIN = 60;
        
        String sec;
        int second, hour, minute, secF;
        
        sec = JOptionPane.showInputDialog(null, "Enter Second/s: ", "Seconds to Time(Hr/Min/Sec)", JOptionPane.QUESTION_MESSAGE);
        second = Integer.parseInt(sec);
        
        hour = second / SECTOHOUR;
        minute = (second % SECTOHOUR) / SECTOMIN;
        secF = second % SECTOMIN;
        
        JOptionPane.showMessageDialog(null, " " + second + " Second/s converted to time is: " + hour + " Hour/s " + minute + " Minute/s " + secF + " Second/s");
        
    }
}
