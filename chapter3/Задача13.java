/*
 * Напишете програма, която проверява дали дадено число n (n<100) е просто
 */

package primenumbers;
import java.util.Scanner;
/**
 *
 * @author marko
 */
public class PrimeNumbers {

  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Въведете число за проверка: ");
        int n = input.nextInt();
        
        boolean isPrime = true;
        
        if (n == 1) {
            isPrime = false;
        }
        
        int dev;
        
        for (dev = 2; dev<=Math.sqrt(n); dev++) {
            if (n % dev == 0) {
                isPrime = false;
                break;
                
            }
        }
        System.out.println(isPrime);
        
    }
    
}
