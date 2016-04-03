/* Напишете програма, която показва знака (+ или -) от произведението на три реални числа, без да го пресмята. 
Използвайте последователност от if оператори.*/

package minusorplusv2;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class MinusOrPlusV2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("The product of the 3 numbers is negative.");
        }
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("The product of the 3 numbers is positive.");
        }
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0");
        }
        
    }

}
