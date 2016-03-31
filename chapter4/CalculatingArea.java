/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingarea;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class CalculatingArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("This program calculates" + "the area of a rectnangle or a triangle");
        
        System.out.print("Enter a and b ( for rectangle) or " + "a and h (for triangle): ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.print("Enter 1 for a rectangle or "+"2 for a triangle: ");
        int choice = input.nextInt();
        
        double area = (double)(a*b)/choice;
        System.out.println("The area of our figure is " + area);
        
    }
    
}
