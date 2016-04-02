/*
 * Напишете програма, която чете от конзолата две цели числа и отпезатва
* по-голямото от тях. Реализирайте програмата без използването на сравнение.
 */
package biggernumber;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class BiggerNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете а: ");
        int a = input.nextInt();
        
        System.out.print("Въведете b: ");
        int b = input.nextInt();
        
        System.out.println(Math.max(a, b));
    }
    
}
