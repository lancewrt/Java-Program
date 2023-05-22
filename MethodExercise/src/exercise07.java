// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise07 {
    public static int MyMethod(boolean a){
        if(a == false){
            return 0;
        }
        else
            return 1;
    }
    
    public static void main(String[] args){
        int a = 1, b = 2;
        boolean test;
        
        test = a >= b;
        
        JOptionPane.showMessageDialog(null, " " + MyMethod(test), "Boolean Parameter", JOptionPane.INFORMATION_MESSAGE);
    }
}
