/*  Да се напише if-конструкция, която проверява стойността на две целочислени променливи и разменя техните стойности, 
ако стойността на първата променлива е по-голяма от втората */

package reversevalues;
import java.util.Scanner;

/**
 *
 * @author Marko
 */
public class ReverseValues {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        int p;
        
        if (a > b) {
            p = a;
            a = b;
            b = p;
        }
        System.out.println(a);
        System.out.println(b);
    }

}
