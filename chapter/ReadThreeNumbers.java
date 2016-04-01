/*
 * Напишете програма, която чете от конзолата 3 числа
* от тип int и отпечатва тяхната сума
 */
package chapterfourproblem1;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ReadThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете първото число: ");
        int firstNumber = input.nextInt();
        
        System.out.print("Въведете второто число: ");
        int secondNumber = input.nextInt();
        
        System.out.print("Въведете третото число: ");
        int thirdNumber = input.nextInt();
        
        int sum = firstNumber + secondNumber + thirdNumber;
        
        System.out.println("Сумата на въведените числа е :" +sum);
    }
    
}
