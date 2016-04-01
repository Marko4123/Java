/*
 * Напишете програма, която чете от конзолата две цели числа и отпечатва,
* колко числа има между тях, такива, че остатъкът им от деленето на 5 да е 0
 */
package dividefive;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class DivideFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Въведете а: ");
         int a = input.nextInt();
         System.out.print("Въведете b: ");
         int b = input.nextInt();
         int count = 0;
        for (int i =a ; i<=b; i++) {
            if (i%5 == 0) {
                count ++; 
                System.out.println("Числата, които се делят на 5 са: " +i);
            }
        }
        System.out.println("Броят числа, които се делят на 5 са: " + count);
    }
    
}

