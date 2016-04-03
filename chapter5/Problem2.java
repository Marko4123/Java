/* Напишете програма, която показва знака (+ или -) от частното на две реални числа, без да го пресмята */
package minusorplus;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class MinusOrPlus {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float a = input.nextInt();
        float b = input.nextInt();
        
        if (a < 0) {
            System.out.println("The sign is minus");
        }
        if (b < 0) {
            System.out.println("The sign is minus");
        }
        if (a < 0 && b< 0) {
            System.out.println("The sign is plus");
        }
        if (a >0 && b > 0) {
            System.out.println("The sign is plus");
        }
    }

}
