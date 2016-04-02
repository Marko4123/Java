/*
 * Напишете програма, която чете 5 числа и отпечатва тяхната сума.
 */
package sumfivenumbers;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class SumFiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Въведете 5 числа: ");
        int sum =0;
        for (int i =1; i<=5; i++) {
            
            int numbers = input.nextInt();
            sum+=numbers;
        }
        System.out.println("Сумата на числата е = " + sum);
    }
    
}
