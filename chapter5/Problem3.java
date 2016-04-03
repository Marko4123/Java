/* Напишете програма, която намира най – голямото по стойност число, измежду три дадени числа */
package biggestnumber;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class BiggestNumber {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Въведете а: ");
        double a = input.nextDouble();
        System.out.println("Въведете b: ");
        double b = input.nextDouble();
        System.out.println("Въведете c: ");
        double c = input.nextDouble();
        
        double biggest = a;
        
        if (b > biggest) {
            biggest = b;
        }
        else {
            if (c > biggest) {
                biggest = c;
            }
        }
        
      System.out.println("The biggest number is: " + biggest);
        
    }

}
