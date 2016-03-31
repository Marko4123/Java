/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readnumbers;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ReadNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("a = ");
        int a = input.nextInt();
        
        System.out.print("b = ");
        int b = input.nextInt();
        
        System.out.printf("%d + %d = %d %n",a,b,(a+b));
        System.out.printf("%d * %d = %d %n", a,b,(a*b));
        
        System.out.print("f = ");
        float f = input.nextFloat();
        
        System.out.printf("%d * %d / %f = %.1f %n",a,b,f,(a*b/f));
    }
    
}
