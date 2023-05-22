// Title: Method Exercise 01
// Date: 10-24-2022
// Author: Lance Bernal

import javax.swing.*;
public class exercise06 {
    public static String hello(boolean a){
        if(a == true){
            return "Hello";
        }
        else
            return "Goodbye";
    }
    
    public static void main(String[] args){
        int a = 1, b = 2;
        boolean test;
        
        test = a >= b;
        
        JOptionPane.showMessageDialog(null, " " + hello(test), "Boolean Parameter", JOptionPane.INFORMATION_MESSAGE);

    }
}
