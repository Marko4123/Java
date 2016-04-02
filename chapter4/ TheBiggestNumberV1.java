/*
 * Напишете програма, която чете 5 числа и отпечатва най-голямото от тях.
 */
package thebiggestnumber;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class TheBiggestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведете първото число: ");
        int firstNumber = input.nextInt();

        System.out.print("Въведете  второто число: ");
        int secondNumber = input.nextInt();

        System.out.print("Въведете третото число: ");
        int thirdNumber = input.nextInt();

        System.out.print("Въведете четвъртото число: ");
        int fourthNumber = input.nextInt();

        System.out.print("Въведете петото число: ");
        int fifthNumber = input.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber) {
            System.out.println(secondNumber);

        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber) {
            System.out.println(thirdNumber);
        }
        else if (fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber) {
            System.out.println(fourthNumber);
        }
        else if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber) {
            System.out.println(fifthNumber);
        }

    }

}
