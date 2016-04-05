/* Напишете програма, която намира най – голямото по стойност число, измежду пет дадени числа */

package problem6;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class Problem6 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Въведете 5 числа: ");
        int biggest = 0;
        for (int i=1; i<=5; i++) {
            int numbers = input.nextInt();
            if (numbers > biggest) {
                biggest = numbers;
            }
        }
        System.out.println("Най-голямото число е:" + biggest);
    }

}
