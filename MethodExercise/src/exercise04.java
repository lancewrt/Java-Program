// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise04 {
    public static int SumOf100(int a, int b){
        int sum = 0;
        int i;
        
        for(i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "The sum from 1 - 100 is: " + SumOf100(1, 100), "Sum of 100", JOptionPane.INFORMATION_MESSAGE);
    }
}
