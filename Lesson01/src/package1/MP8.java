/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.util.Scanner;
//Read input
public class MP8 {
    public static void main(String[]args){
        String name;
        int age;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name=input.nextLine();
        
        System.out.println("Enter your age:");
        age=input.nextInt();
        
        
        System.out.println("Your name is" + name+ "and your age is:" + age);
        
    }
}
