/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtext;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ReadText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.printf ("Hello %s %s! %n",firstName,lastName);
        
        
    }
    
}
