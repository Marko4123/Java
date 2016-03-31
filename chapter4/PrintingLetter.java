/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingletter;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class PrintingLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter person name: ");
        String personName = input.nextLine();
        
        System.out.print("Enter the book name: ");
        String bookName = input.nextLine();
        
        String from = "Authors team";
        
        System.out.printf("    Dear %s %n", personName);
        System.out.printf("We are pleased to inform "+ "you that \"%2$s\" is the Best bulgarian book. %n"+
                "The authors of the book wish you good lock %1$s! %n", personName,bookName                
                );
        System.out.println("   Yours, ");
        System.out.printf("   %s %n",from);

        
    }
    
}
