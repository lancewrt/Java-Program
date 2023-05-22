/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import javax.swing.JOptionPane;
//Swing class to read inputs
public class MP9 {
    public static void main(String[]args){
        
        String result;
        result=JOptionPane.showInputDialog(null,"What is your name?");
        JOptionPane.showMessageDialog(null, "Hello" + result);
        
        
    }
}
